package com.mohmedhassan.ownertrainingroom.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.mohmedhassan.ownertrainingroom.HomeLoginAndContactUs.HomeLoginAndContactUsActivity;
import com.mohmedhassan.ownertrainingroom.HomeScreen.HomeScreenActivity;
import com.mohmedhassan.ownertrainingroom.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.view{

    Button Login;
    private EditText mEmailView, mPasswordView;
    // private View mProgressView;
    ProgressDialog progressDialog;
    private CheckBox checkBoxShowPassword;
    String EmailHolder, PasswordHolder;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginActivity.this.setTitle("Login");


        loginPresenter = new LoginPresenter(this, this);


        // Set up the login form.
        mEmailView = findViewById(R.id.ed_email_login);
        mPasswordView = findViewById(R.id.ed_password_login);
        checkBoxShowPassword = findViewById(R.id.checkboxPassword_Login);
        Login = findViewById(R.id.btnlogin);

        checkBoxShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    mPasswordView.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    mPasswordView.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });


       // attemptLogin();
        Login.setOnClickListener(view-> attemptLogin());

    }

    @Override
    public void attemptLogin() {

        mEmailView.setError(null);
        mPasswordView.setError(null);

        // Store values at the time of the login attempt.
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a valid password, if the user entered one.
        if (TextUtils.isEmpty(password)) {
            mPasswordView.setError(getString(R.string.error_field_required));
            focusView = mPasswordView;
            cancel = true;
        } else if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            mPasswordView.setError(getString(R.string.error_invalid_password));
            focusView = mPasswordView;
            cancel = true;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(email)) {
            mEmailView.setError(getString(R.string.error_field_required));
            focusView = mEmailView;
            cancel = true;
        } else if (!isEmailValid(email)) {
            mEmailView.setError(getString(R.string.error_invalid_email));
            focusView = mEmailView;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            showProgress(true);
            loginPresenter.login(email, password);
           // Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
           /* Intent intent = new Intent(LoginActivity.this, HomeLoginAndContactUsActivity.class);
            startActivity(intent);*/

        }
    }

    @Override
    public void showMessage(String message) {

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();


    }

    @Override
    public void showProgress(boolean show) {

        int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);


        // mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);

        progressDialog = ProgressDialog.show(LoginActivity.this, "Loading .. ", "Please Wait ..... ", true, true);

    }

    @Override
    public boolean isEmailValid(String email) {
        return email.contains("@");

    }

    @Override
    public boolean isPasswordValid(String password) {
        return password.length() > 5;

    }

    @Override
    public void BtnLogin() {

        Intent intent = new Intent(LoginActivity.this, HomeScreenActivity.class);
        startActivity(intent);
        finish();

    }


}
