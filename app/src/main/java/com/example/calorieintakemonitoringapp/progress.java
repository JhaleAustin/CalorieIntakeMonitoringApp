package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class progress extends AppCompatActivity {

    Button nextButton, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    ProgressBar progressBar;
    LinearLayout Container, Container2, Container3, Container4, Container5, Container6, Container7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        // Initialize views
        progressBar = findViewById(R.id.progressBar);
        Container = findViewById(R.id.Container);
        Container2 = findViewById(R.id.Container2);
        Container3 = findViewById(R.id.Container3);
        Container4 = findViewById(R.id.Container4);
        Container5 = findViewById(R.id.Container5);
        Container6 = findViewById(R.id.Container6);
        Container7 = findViewById(R.id.Container7);
        nextButton = findViewById(R.id.nextButton);

        // Set initial visibility and progress
        progressBar.setVisibility(View.VISIBLE);
        progressBar.setIndeterminate(false);
        progressBar.setProgress(40);
        Container.setVisibility(View.VISIBLE);
        Container2.setVisibility(View.INVISIBLE);
        Container3.setVisibility(View.INVISIBLE);
        Container4.setVisibility(View.INVISIBLE);
        Container5.setVisibility(View.INVISIBLE);
        Container6.setVisibility(View.INVISIBLE);
        Container7.setVisibility(View.INVISIBLE);

        b1= findViewById(R.id.Button1);
        b2= findViewById(R.id.Button2);
        b3= findViewById(R.id.Button3);
        b4= findViewById(R.id.Button4);
        b5= findViewById(R.id.Button5);
        b6= findViewById(R.id.Button6);
        b7= findViewById(R.id.Button7);
        b8= findViewById(R.id.Button8);
        b9= findViewById(R.id.Button9);
        b10= findViewById(R.id.button10);
        b11= findViewById(R.id.button11);
        b12= findViewById(R.id.button12);

        b13= findViewById(R.id.Button13);
        b14= findViewById(R.id.Button14);
        b15= findViewById(R.id.Button15);
        b16= findViewById(R.id.button16);
        b17= findViewById(R.id.button17);
        b18= findViewById(R.id.button18);
        b19= findViewById(R.id.button19);
        b20= findViewById(R.id.button20);

        // Set onClickListeners for buttons
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container.setVisibility(View.INVISIBLE);
                Container2.setVisibility(View.VISIBLE);

//                Intent intent = new Intent(progress.this, loadingPage.class);
//          startActivity(intent);
            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container2.setVisibility(View.INVISIBLE);
                Container3.setVisibility(View.VISIBLE);
//                Intent intent = new Intent(progress.this, Main.class);
//           startActivity(intent);
//
            }
        });
//
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container2.setVisibility(View.INVISIBLE);
                Container3.setVisibility(View.VISIBLE);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container2.setVisibility(View.INVISIBLE);
                Container3.setVisibility(View.VISIBLE);

            }
        });
//
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container3.setVisibility(View.INVISIBLE);
                Container4.setVisibility(View.VISIBLE);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container3.setVisibility(View.INVISIBLE);
                Container4.setVisibility(View.VISIBLE);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container3.setVisibility(View.INVISIBLE);
                Container4.setVisibility(View.VISIBLE);

            }
        });


//
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container4.setVisibility(View.INVISIBLE);
                Container5.setVisibility(View.VISIBLE);

            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container4.setVisibility(View.INVISIBLE);
                Container5.setVisibility(View.VISIBLE);

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container4.setVisibility(View.INVISIBLE);
                Container5.setVisibility(View.VISIBLE);

            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container4.setVisibility(View.INVISIBLE);
                Container5.setVisibility(View.VISIBLE);

            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container5.setVisibility(View.INVISIBLE);
                Container6.setVisibility(View.VISIBLE);

//                Intent intent = new Intent(progress.this, Main.class);
//                startActivity(intent);

            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Container6.setVisibility(View.INVISIBLE);
                Container7.setVisibility(View.VISIBLE);

            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(progress.this, loadingPage.class);
                startActivity(intent);

            }
        });

    }
}
