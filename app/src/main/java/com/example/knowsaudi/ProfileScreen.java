package com.example.knowsaudi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.developer.kalert.KAlertDialog;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

import java.util.Arrays;
import java.util.List;

public class ProfileScreen extends AppCompatActivity {

    TextView textName, textLocation, phonenum;
    RatingBar ratingbar;
    ImageView image;
    KAlertDialog pDialog;
    private Handler mHandler;
    String service_name, location, budget, imageLink, placeid, id, fb, token, phone,placeaddress;
    Float ratingfloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        getSupportActionBar().hide();


        textName=findViewById(R.id.name);
        textLocation=findViewById(R.id.location);
        phonenum=findViewById(R.id.phoneprofile);
        ratingbar=findViewById(R.id.ratingstar);

        SharedPreferences preferences;
        preferences= SignIn.context.getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String name=preferences.getString("name","notloggedin");
        String location=preferences.getString("location","notloggedin");
        String phone=preferences.getString("phone","notloggedin");

        textName.setText(name);
        textLocation.setText(location);
        phonenum.setText(phone);

        ratingbar.setRating(Float.parseFloat("3.0"));
    }
}
