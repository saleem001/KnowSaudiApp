package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupBoth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_both);

        getSupportActionBar().hide();


    }

    public void SignupAsDriver(View view) {

        Intent intent=new Intent(SignupBoth.this,Signup.class);
        intent.putExtra("user","1");
        startActivity(intent);
    }

    public void SignupAsTourist(View view) {

        Intent intent=new Intent(SignupBoth.this,Signup.class);
        intent.putExtra("user","2");
        startActivity(intent);
    }
}
