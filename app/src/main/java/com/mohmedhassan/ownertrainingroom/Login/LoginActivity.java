package com.mohmedhassan.ownertrainingroom.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mohmedhassan.ownertrainingroom.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.view{

    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginActivity.this.setTitle("Login");

        Login = findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    @Override
    public void Login() {

    }
}
