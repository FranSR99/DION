package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class BuyPharmacy extends AppCompatActivity {
private double price=0.00;
private String pricetext="";
private int[] ProductQuantity= new int[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_pharmacy);
        final TextView Price_TextView = (TextView) findViewById(R.id.price_pharmacy);
        ImageButton product1 = (ImageButton) findViewById(R.id.product1_pharmacy);
        final Double price1 = (Double) 5.6;
        ImageButton product2 = (ImageButton) findViewById(R.id.product2_pharmacy);
        final Double price2 = (Double) 2.4;
        ImageButton product3 = (ImageButton) findViewById(R.id.product3_pharmacy);
        final Double price3 = (Double) 6.5;
        ImageButton product4 = (ImageButton) findViewById(R.id.product4_pharmacy);
        final Double price4 = (Double) 4.8;
        ImageButton product5 = (ImageButton) findViewById(R.id.product5_pharmacy);
        final Double price5 = (Double) 1.3;
        ImageButton product6 = (ImageButton) findViewById(R.id.product6_pharmacy);
        final Double price6 = (Double) 3.2;


        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[0]=ProductQuantity[0]+1;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        product2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[1]++;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        product3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[2]++;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        product4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[3]++;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        product5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[4]++;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        product6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Price_TextView.getVisibility() == View.INVISIBLE) Price_TextView.setVisibility(View.VISIBLE);
                ProductQuantity[5]++;
                price = ProductQuantity[0]*price1+ProductQuantity[1]*price2+ProductQuantity[2]*price3+ProductQuantity[3]*price4+ProductQuantity[4]*price5+ProductQuantity[5]*price6;
                pricetext=Double.toString(price);
                int position = pricetext.indexOf(".");
                if (position != -1 && pricetext.length() > position+2) {
                    pricetext = pricetext.substring(0,position+3);
                };
                if (position != -1 && pricetext.length() == position+3 && pricetext.charAt(position+2) == '0') {
                    pricetext = pricetext.substring(0,position+1);
                }
                if (position != -1 && pricetext.length() == position+2 && pricetext.charAt(position+1) == '0') {
                    pricetext = pricetext.substring(0,position);
                }
                Price_TextView.setText(pricetext + " €");
            }
        });

        LinearLayout Receipt = (LinearLayout) findViewById(R.id.Medicalreceipt_Layout);
        Receipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToScanReceipt = new Intent();
                GoToScanReceipt.setClass(getApplicationContext(), ReceiptScan.class);
                startActivity(GoToScanReceipt);
            }
        });

        Button buybutton = (Button) findViewById(R.id.buy_button);
        buybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GoToBuy = new Intent();
                GoToBuy.setClass(getApplicationContext(), BuyPharmacy2.class);
                GoToBuy.putExtra("ProductQuantity",ProductQuantity);
                startActivity(GoToBuy);
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