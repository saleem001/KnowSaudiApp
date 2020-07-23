package com.example.knowsaudi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.developer.kalert.KAlertDialog;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {

    private EditText emailTV, passwordTV;
    private FirebaseAuth mAuth;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    KAlertDialog pDialog;

    public static  Context  context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mAuth = FirebaseAuth.getInstance();
        initializeUI();
        sharedpreferences = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();
        context=this;
        getSupportActionBar().hide();

    }

    //function to hide keyboard when touch on ui
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getCurrentFocus() != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        return super.dispatchTouchEvent(ev);
    }

    private void initializeUI() {
        emailTV = findViewById(R.id.email);
        passwordTV = findViewById(R.id.passwordtextview);
    }

    public void showSignupScreen(View view) {
        Intent intent=new Intent(SignIn.this,Signup.class);
        startActivity(intent);
    }

    public void Signin(View view) {
        loginUserAccount();
    }


    private void loginUserAccount() {

        pDialog = new KAlertDialog(this, KAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#0091ea"));
        pDialog.setTitleText("Please Wait");
        pDialog.setCancelable(false);
        final String email, password;
        email = emailTV.getText().toString();
        password = passwordTV.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        }
        if(email.equals("inam@gmail.com"))
        {
            if(password.equals("inam123"))
            {
                editor.putString("name","inam");
                editor.putString("location","Riyadh");
                editor.putString("phone","+966 654 2342");
                editor.commit();
                Toast.makeText(getApplicationContext(), "Successfully LoggedIn", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),MainScreen.class);
                startActivity(intent);
            }
        }
        else {
            Toast.makeText(getApplicationContext(), "credentials do not match", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
            pDialog.dismiss();
    }
}
