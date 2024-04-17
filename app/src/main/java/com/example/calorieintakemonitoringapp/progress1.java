package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class progress1 extends AppCompatActivity {

    Button nextButton,Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,Button10,Button11,Button12;
    TextView usernameLabel,Label1,Label2;
    EditText nameEditText;
    ProgressBar ProgressBar;
    LinearLayout Container,Container2,Container3,Container4,Container5,Container6,Container7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress1);


        nextButton = findViewById(R.id.nextButton);
        usernameLabel = findViewById(R.id.usernameLabel);
        nameEditText = findViewById(R.id.nameEditText);
        Container = findViewById(R.id.Container);
        Container2 = findViewById(R.id.Container2);
        ProgressBar = findViewById(R.id.progressBar);
         Button1 = findViewById(R.id.Button1);
        Button2 = findViewById(R.id.Button2);
        Button3 = findViewById(R.id.Button3);

        Container3 = findViewById(R.id.Container3);
        Container4 = findViewById(R.id.Container4);
        Container5 = findViewById(R.id.Container5);
        Button4 = findViewById(R.id.Button4);
        Button5 = findViewById(R.id.Button5);
        Button6 = findViewById(R.id.Button6);
        Button11 = findViewById(R.id.button11);

        Button12 = findViewById(R.id.button12);

        Container6 = findViewById(R.id.Container6);

        Container7 = findViewById(R.id.Container7);

        nextButton.setVisibility(View.VISIBLE);

        usernameLabel.setVisibility(View.VISIBLE);

        nameEditText.setVisibility(View.VISIBLE);

        Container.setVisibility(View.VISIBLE);

        ProgressBar.setVisibility(View.VISIBLE);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Container.setVisibility(View.INVISIBLE);
                Container2.setVisibility(View.VISIBLE);
                ProgressBar.setProgress(40);


            }
        });


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Container2.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(60);
                Container3.setVisibility(View.VISIBLE);


            }
        });


        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Container2.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(60);
                Container3.setVisibility(View.VISIBLE);


            }
        });


        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container3.setVisibility(View.VISIBLE);

                Container2.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(60);


            }
        });


        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container3.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(80);

                Container4.setVisibility(View.VISIBLE);


            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container3.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(80);

                Container4.setVisibility(View.VISIBLE);


            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container3.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(80);

                Container4.setVisibility(View.VISIBLE);


            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container4.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container5.setVisibility(View.VISIBLE);


            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container4.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container5.setVisibility(View.VISIBLE);


            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container4.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container5.setVisibility(View.VISIBLE);


            }
        });

        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container4.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container5.setVisibility(View.VISIBLE);


            }
        });


        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container5.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container6.setVisibility(View.VISIBLE);


            }
        });




        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Container6.setVisibility(View.INVISIBLE);
                ProgressBar.setProgress(100);
                Container7.setVisibility(View.VISIBLE);


            }
        });




    }
}
