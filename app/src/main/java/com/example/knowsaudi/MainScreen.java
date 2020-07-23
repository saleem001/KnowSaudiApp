package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.FrameLayout;


public class MainScreen extends AppCompatActivity {

//    FrameLayout fragmentTourGuide;
//    Fragment fragment1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

       // fragmentTourGuide=findViewById(R.id.fragment_container);
        getSupportActionBar().hide();


    }

    public void onHomeClick(View view) {
    }

    public void onProfileClick(View view) {
        Intent intent=new Intent(getApplicationContext(), ProfileScreen.class);
        startActivity(intent);
    }

    public void onSettingsClick(View view) {
    }

    public void onUsrMngmnt(View view) {
    }

    public void onAdminDB(View view) {
        Intent intent=new Intent(getApplicationContext(),AdminsDB.class);
        startActivity(intent);
    }

    public void onPendingOffrs(View view) {
        Intent intent=new Intent(getApplicationContext(),PendingOffers.class);
        startActivity(intent);
    }

    public void onTouristDB(View view) {

        Intent intent=new Intent(getApplicationContext(),TouristDB.class);
        startActivity(intent);

//        fragmentTourGuide.setVisibility(View.VISIBLE);
//        fragment1 = new TourGuideFragment();
//
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//        transaction.replace(R.id.fragment_container, fragment1);
//        transaction.addToBackStack(null);
//
//        transaction.commit();
    }

    public void onRating(View view) {
    }


    public void onMyRide(View view) {
        Intent intent=new Intent(getApplicationContext(),RiyadhLandmarks.class);
        startActivity(intent);
    }

    public void onTourGuidDB(View view) {
        Intent intent=new Intent(getApplicationContext(),TourGuideDB.class);
        startActivity(intent);
    }
}
