package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyHospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_hospital);

        Button BookDoctor = (Button) findViewById(R.id.BookDoctor_button);
        BookDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToBookDoctor = new Intent();
                GoToBookDoctor.setClass(getApplicationContext(), BookDoctor.class);
                startActivity(GoToBookDoctor);
            }
        });

        Button MyAppointments = (Button) findViewById(R.id.MyAppointments_button);
        MyAppointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToMyAppointments = new Intent();
                GoToMyAppointments.setClass(getApplicationContext(), MyAppointments.class);
                startActivity(GoToMyAppointments);
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