package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.knowsaudi.Adapters.PendingOffersAdapter;
import com.example.knowsaudi.Models.PendingOfferModel;

import java.util.ArrayList;

public class PendingOffers extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_offers);

        getSupportActionBar().hide();

        listView = findViewById(R.id.driverlist);

        ArrayList<PendingOfferModel> arrayList = new ArrayList<PendingOfferModel>();
        arrayList.add(new PendingOfferModel("Mohammad Ali", "English,French","2" ,"250 Sr","Land Cruiser 2019",R.drawable.ic_cancel_black_24dp,R.drawable.ic_check_circle_black_24dp,R.drawable.manager));
        arrayList.add(new PendingOfferModel("Aia Mousa ", "English,Arabic","1" ,"200 Sr","Peugeot GT5008 2018",R.drawable.ic_cancel_black_24dp,R.drawable.ic_check_circle_black_24dp,R.drawable.businesswoman));

        PendingOffersAdapter customAdapter = new PendingOffersAdapter(getApplicationContext(), 0, arrayList);
        listView.setAdapter(customAdapter);

    }

    public void backButton(View view) {
        this.finish();
    }
}
