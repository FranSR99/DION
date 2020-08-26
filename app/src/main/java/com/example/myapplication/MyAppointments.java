package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MyAppointments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_appointments);

        Button Videocall = (Button) findViewById(R.id.videocall_button);
        Videocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Quedan 10 minutos para el inicio de su videollamada", Toast.LENGTH_LONG).show();
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

        TextView MyHospital = (TextView) findViewById(R.id.MyHospital_TextView);
        MyHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMyHospital = new Intent();
                GoToMyHospital.setClass(getApplicationContext(), MyHospital.class);
                startActivity(GoToMyHospital);
            }
        });
    }
}