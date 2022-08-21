package com.example.breatheexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public ImageButton Button1,Button4,Button5,Button6,Button7,Button8,Button9,Button10,Button11,Button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1=(ImageButton)findViewById(R.id.imageButton);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, secondscreen.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        Button4=(ImageButton)findViewById(R.id.imageButton69);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent2 = new Intent(MainActivity.this, humbeescreen.class);
                MainActivity.this.startActivity(myIntent2);
            }
        });
        Button5=(ImageButton)findViewById(R.id.imageButton3);
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent3 = new Intent(MainActivity.this, diaphragmaticbreathing.class);
                MainActivity.this.startActivity(myIntent3);
            }
        });
        Button6=(ImageButton)findViewById(R.id.imageButton4);
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent4 = new Intent(MainActivity.this, lionbr.class);
                MainActivity.this.startActivity(myIntent4);
            }
        });
        Button7=(ImageButton)findViewById(R.id.imageButton5);
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent5 = new Intent(MainActivity.this, pursedlip.class);
                MainActivity.this.startActivity(myIntent5);
            }
        });

                Button8=(ImageButton)findViewById(R.id.imageButton6);
                Button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent6 = new Intent(MainActivity.this, equalbrea.class);
                        MainActivity.this.startActivity(myIntent6);
            }
        });

                Button9=(ImageButton)findViewById(R.id.imageButton7);
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent7 = new Intent(MainActivity.this, sitalibrea.class);
                MainActivity.this.startActivity(myIntent7);

            }
        });
        Button10=(ImageButton)findViewById(R.id.imageButton8);
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent8 = new Intent(MainActivity.this, resonantbreathing.class);
                MainActivity.this.startActivity(myIntent8);

            }
        });
        Button11=(ImageButton)findViewById(R.id.imageButton9);
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent9 = new Intent(MainActivity.this, breathingfocus.class);
                MainActivity.this.startActivity(myIntent9);

            }
        });
        Button12=(ImageButton)findViewById(R.id.imageButton2);
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent10 = new Intent(MainActivity.this, deepbreathing.class);
                MainActivity.this.startActivity(myIntent10);

            }
        });
    }
    }

