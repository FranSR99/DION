package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyPharmacy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pharmacy);
        Button Makeorder_button = (Button) findViewById(R.id.Makeorder_button);
        Makeorder_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMakeOrderPharmacy = new Intent();
                GoToMakeOrderPharmacy.setClass(getApplicationContext(), BuyPharmacy.class);
                startActivity(GoToMakeOrderPharmacy);
            }
        });

        Button DeliveryState = (Button) findViewById(R.id.deliverystate_button);
        DeliveryState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToDeliveryState = new Intent();
                GoToDeliveryState.setClass(getApplicationContext(), DeliveryStatePharmacy.class);
                startActivity(GoToDeliveryState);
            }
        });

        LinearLayout HOME = (LinearLayout) findViewById(R.id.DION_LAYOUT);

        HOME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToHome = new Intent();
                GoToHome.setClass(getApplicationContext(), HomeActivity.class);
                startActivity(GoToHome);
            }
        });

    }
}