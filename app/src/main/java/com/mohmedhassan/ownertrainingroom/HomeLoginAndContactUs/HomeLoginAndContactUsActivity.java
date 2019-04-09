package com.mohmedhassan.ownertrainingroom.HomeLoginAndContactUs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mohmedhassan.ownertrainingroom.Login.LoginActivity;
import com.mohmedhassan.ownertrainingroom.R;
import com.mohmedhassan.ownertrainingroom.Register.RegisterAcitvity;

public class HomeLoginAndContactUsActivity extends AppCompatActivity implements HomeLoginAndContactUsContract.view{

    LinearLayout LinearlayoutLogin;
    TextView Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_login_contact_us);



        LinearlayoutLogin = findViewById(R.id.linearlayoutRegister);
       // Login= findViewById(R.id.Login_Home);


        LinearlayoutLogin.setOnClickListener(view->Login());
      //  LinearlayoutLogin.setOnClickListener(view->Register());



    }


    @Override
    public void Login() {

        Intent intent = new Intent(HomeLoginAndContactUsActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void Register() {

        Intent intent = new Intent(HomeLoginAndContactUsActivity.this, RegisterAcitvity.class);
        startActivity(intent);
    }
}
