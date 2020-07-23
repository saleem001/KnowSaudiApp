package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.kalert.KAlertDialog;

import static android.view.View.GONE;

public class Signup extends AppCompatActivity {

    private EditText emailTV, passwordTV, confirmPasswordTV, locationTV, nameTV;

    String name, password, confirmPassword, phone, email, location;

    KAlertDialog pDialog;

    TextView driver,tourist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initializeUI();

        Intent intent=getIntent();
        String userid=intent.getStringExtra("user");

        if(userid.equals("1")) {
            tourist.setVisibility(GONE);
            driver.setVisibility(View.VISIBLE);
        }
        else if(userid.equals("2")) {
            tourist.setVisibility(View.VISIBLE);
            driver.setVisibility(GONE);
        }
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
        emailTV = findViewById(R.id.signup_email);
        passwordTV = findViewById(R.id.signup_password);
        confirmPasswordTV = findViewById(R.id.confirm_password);
        locationTV = findViewById(R.id.signup_phone);
        nameTV = findViewById(R.id.signupname);

        driver=findViewById(R.id.driverText);
        tourist=findViewById(R.id.touristText);

    }

    public void Signup(View view) {
        registerNewUser();
    }

    private void registerNewUser() {

        name = nameTV.getText().toString();
        email = emailTV.getText().toString();
        password = passwordTV.getText().toString();
        confirmPassword = confirmPasswordTV.getText().toString();
        location = locationTV.getText().toString();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Please enter email...", Toast.LENGTH_LONG).show();
            return;

        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Please enter password!", Toast.LENGTH_LONG).show();
            return;
        } else if (TextUtils.isEmpty(confirmPassword)) {
            Toast.makeText(getApplicationContext(), "Please enter Confirm password!", Toast.LENGTH_LONG).show();
            return;
        } else if (TextUtils.isEmpty(location)) {
            Toast.makeText(getApplicationContext(), "Please enter Location!", Toast.LENGTH_LONG).show();
            return;
        }

        if (password.equals(confirmPassword)) {

            pDialog = new KAlertDialog(this, KAlertDialog.PROGRESS_TYPE);
            pDialog.getProgressHelper().setBarColor(Color.parseColor("#0091ea"));
            pDialog.setTitleText("Please Wait");
            pDialog.setCancelable(false);
            pDialog.show();
            Toast.makeText(this, "Successfully Signed up", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Signup.this,MainScreen.class);
            startActivity(intent);
            pDialog.dismiss();
            pDialog=null;

        }
        else {
            Toast.makeText(this, "Passwords do not Match", Toast.LENGTH_SHORT).show();
        }
    }
}
