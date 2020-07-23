package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.knowsaudi.Adapters.TouristAdapter;
import com.example.knowsaudi.Models.TouristModel;

import java.util.ArrayList;

public class TouristDB extends AppCompatActivity {


    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_d_b);

        getSupportActionBar().hide();

        listView=findViewById(R.id.touristList);

        ArrayList<TouristModel> arrayList=new ArrayList<TouristModel>();
        arrayList.add(new TouristModel("Mohammad Ali","Riyadh",R.drawable.manager));
        arrayList.add(new TouristModel("Alia Mousa","Riyadh",R.drawable.businesswoman));
        arrayList.add(new TouristModel("Sara Abdullah","Jeddah",R.drawable.businesswoman));
        arrayList.add(new TouristModel("Marwan Osama","Jeddah",R.drawable.manager));

        TouristAdapter customAdapter=new TouristAdapter(TouristDB.this,0,arrayList);
        listView.setAdapter(customAdapter);
    }
}
