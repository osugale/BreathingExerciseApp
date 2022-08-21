package com.example.breatheexerciseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class diaphragmaticbreathing extends AppCompatActivity {

    public ImageButton Button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaphragmaticbreathing);

        Button6= (ImageButton) findViewById(R.id.imageButton15);
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Mg2ar-7_HfA")));
            }
        });
    }
}

