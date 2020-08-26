package com.example.myapplication;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SignIn_button = (Button) findViewById(R.id.button_signin);

        final EditText Username_edittext = (EditText) findViewById(R.id.editText_Username);
        final String user = (String) Username_edittext.getText().toString();
        Username_edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = (String) Username_edittext.getText().toString();
                if (username.equals(user)) {
                    Username_edittext.setText("");
                }
            }
        });

        final EditText Password_edittext = (EditText) findViewById(R.id.editText_Password);
        final String password = (String) Password_edittext.getText().toString();
        Password_edittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password1 = (String) Password_edittext.getText().toString();
                if (password1.equals(password)) {
                    Password_edittext.setText("");
                }
            }
        });

        SignIn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String username = (String) Username_edittext.getText().toString();
                String password = (String) Password_edittext.getText().toString();
                if (username.equals("Fran") && password.equals("1234")) {
                    String Role = (String) "Customer";
                    Intent GoToHome = new Intent();
                    GoToHome.setClass(getApplicationContext(), HomeActivity.class);
                    startActivity(GoToHome);
                }
                else {
                    Toast.makeText(getApplicationContext(), R.string.Wrong_SignIn, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}