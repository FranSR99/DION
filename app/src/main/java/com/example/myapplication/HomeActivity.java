package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //MYHOSPITAL NAVIGATION BUTTON
        Button MyHospital = (Button) findViewById(R.id.button_myhospital);
        MyHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMyHospital = new Intent();
                GoToMyHospital.setClass(getApplicationContext(), MyHospital.class);
                startActivity(GoToMyHospital);
            }
        });

        //MYPHARMACY NAVIGATION BUTTON
        Button MyPharmacy = (Button) findViewById(R.id.button_mypharmacy);
        MyPharmacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMyPharmacy = new Intent();
                GoToMyPharmacy.setClass(getApplicationContext(), MyPharmacy.class);
                startActivity(GoToMyPharmacy);
            }
        });

    }
}