package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DeliveryStatePharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_state_pharmacy);
        LinearLayout HOME = (LinearLayout) findViewById(R.id.DION_LAYOUT);

        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToHome = new Intent();
                GoToHome.setClass(getApplicationContext(), HomeActivity.class);
                startActivity(GoToHome);
            }
        });

        TextView MyPharmacy = (TextView) findViewById(R.id.MyPharmacy_TextView);
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