package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiptScan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_scan);
        Button AddtoChart = (Button) findViewById(R.id.addtochart_button);
        AddtoChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMakeOrderPharmacy = new Intent();
                GoToMakeOrderPharmacy.setClass(getApplicationContext(), BuyPharmacy.class);
                startActivity(GoToMakeOrderPharmacy);
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