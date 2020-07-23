package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleLandmark extends AppCompatActivity {

    TextView headingtext,abouttext,detailtext;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_landmark);

        getSupportActionBar().hide();

        Intent intent = getIntent();
        String position = intent.getStringExtra("position");

        headingtext = findViewById(R.id.headingtext);
        abouttext = findViewById(R.id.abouttext);
        detailtext = findViewById(R.id.detailtext);

        imageView = findViewById(R.id.imagelandmark);
        if (position.equals("0")) {
            headingtext.setText("Almasmak fortress");
            abouttext.setText("About Almasmak fortress:");
            detailtext.setText("In the early hours of January 14, 1902, the garrison inside the Masmak Fortress slept as the forces of Abdulaziz bin Abdul Rahman bin Faisal Al Saud gathered and prepared for attack. Taking the fortress by surprise, Abdulaziz captured the fort and took control of Riyadh, his ancestral home after having lived in exile in Kuwait. From this fortress, Abdulaziz Al Saud conquered and united the different kingdoms and provinces that make up the modern Kingdom of Saudi Arabia.");
            imageView.setImageResource(R.drawable.almasmak);
        } else if (position.equals("1")) {
            headingtext.setText("National Museum");
            abouttext.setText("About National Museum:");
            detailtext.setText("The National Museum of Saudi Arabia is a major national museum in Saudi Arabia. Established in 1999, it is part of the King Abdulaziz Historical Centre in Riyadh");
            imageView.setImageResource(R.drawable.museum);

        } else if (position.equals("2")) {
            headingtext.setText("Wadi Hanifah");
            abouttext.setText("About Wadi Hanifah:");
            detailtext.setText("Wadi Hanifa is a wadi in the Najd region, Riyadh Province, in central Saudi Arabia. The valley runs for a length of 120 km from northwest to southeast, cutting through the city of Riyadh, the capital of Saudi Arabia. A string of towns and villages lie along the valley, including Uyaynah, Irqah and Diriyah");
            imageView.setImageResource(R.drawable.wadi);

        } else if (position.equals("3")) {
            headingtext.setText("King Abdullah Park");
            abouttext.setText("About King Abdullah Park:");
            detailtext.setText("Big city park with 12-m. walkways, play & sports areas & daily dancing water fountain displays.");
            imageView.setImageResource(R.drawable.kingabdullahpark);
        }
    }

    public void BookRide(View view) {

        Intent intent=new Intent(getApplicationContext(),BookingRide.class);
        startActivity(intent);

    }

    public void backButton(View view) {
        this.finish();
    }
}
