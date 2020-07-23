package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.knowsaudi.Adapters.TourGuideAdapter;
import com.example.knowsaudi.Models.TourGuideModel;

import java.util.ArrayList;

public class TourGuideDB extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide_d_b);
        listView=findViewById(R.id.tourguideList);

        getSupportActionBar().hide();

        ArrayList<TourGuideModel> arrayList=new ArrayList<TourGuideModel>();
        arrayList.add(new TourGuideModel("Mohammad Ali","Riyadh",R.drawable.manager));
        arrayList.add(new TourGuideModel("Alia Mousa","Riyadh",R.drawable.businesswoman));
        arrayList.add(new TourGuideModel("Sara Abdullah","Jeddah",R.drawable.businesswoman));
        arrayList.add(new TourGuideModel("Marwan Osama","Jeddah",R.drawable.manager));

        TourGuideAdapter customAdapter=new TourGuideAdapter(getApplicationContext(),0,arrayList);
        listView.setAdapter(customAdapter);

    }
}
