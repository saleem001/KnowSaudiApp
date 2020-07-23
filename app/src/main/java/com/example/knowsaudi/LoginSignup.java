package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        getSupportActionBar().hide();

    }

    public void Signin(View view) {
        Intent intent=new Intent(LoginSignup.this,SignIn.class);
        startActivity(intent);
    }

    public void Signup(View view) {
        Intent intent=new Intent(LoginSignup.this,SignupBoth.class);
        startActivity(intent);
    }
}
