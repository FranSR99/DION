package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BookDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_doctor);
        Button VirtualAppointment = (Button) findViewById(R.id.virtualAppointment_button);
        VirtualAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Su cita ha sido reservada", Toast.LENGTH_SHORT).show();
            }
        });

        Button HospitalAppointment = (Button) findViewById(R.id.HospitalAppointment_button);
        HospitalAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Su cita ha sido reservada", Toast.LENGTH_SHORT).show();
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