package com.example.knowsaudi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DatabaseReference;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class BookingRide extends AppCompatActivity {


    MaterialButton male,female;
    DatePickerDialog datePickerDialog;

TextView datetxt,timetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_ride);


        male=findViewById(R.id.male);
        female=findViewById(R.id.femalebutton);
        datetxt=findViewById(R.id.datetext);
        timetext=findViewById(R.id.selectTimeText);

        final NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker1);
        np.setMaxValue(100);
        np.setMinValue(12);
        np.setWrapSelectorWheel(false);
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });

        final NumberPicker np2 = (NumberPicker) findViewById(R.id.numberPicker2);
        np2.setMaxValue(12);
        np2.setMinValue(1);
        np2.setWrapSelectorWheel(false);
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

            }
        });

    }

    public void backButton(View view) {
        this.finish();
    }

    public void Selectdate(View view) {
        final Calendar cldr = Calendar.getInstance();
        int day = cldr.get(Calendar.DAY_OF_MONTH);
        int month = cldr.get(Calendar.MONTH);
        int year = cldr.get(Calendar.YEAR);
        // date picker dialog
        datePickerDialog = new DatePickerDialog(BookingRide.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        datetxt.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, year, month, day);
        datePickerDialog.show();
    }

    public void Selecttime(View view) {

        Calendar mcurrentTime = Calendar.getInstance();
        int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
        int minute = mcurrentTime.get(Calendar.MINUTE);
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(BookingRide.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                timetext.setText( selectedHour + ":" + selectedMinute);
            }
        }, hour, minute, true);//Yes 24 hour time
        mTimePicker.setTitle("Select Time");
        mTimePicker.show();
    }

    public void SubmitRequest(View view) {
        Toast.makeText(this, "Your Request has been Submitted", Toast.LENGTH_SHORT).show();
    }

    public void femaleButton(View view) {
        female.setBackgroundTintList(this.getResources().getColorStateList(R.color.light));
        male.setBackgroundTintList(this.getResources().getColorStateList(R.color.colorWhite));

    }

    public void maleButton(View view) {
        male.setBackgroundTintList(this.getResources().getColorStateList(R.color.light));
        female.setBackgroundTintList(this.getResources().getColorStateList(R.color.colorWhite));

    }
}
