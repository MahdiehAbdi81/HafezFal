package com.example.hafezfal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fal = findViewById(R.id.fal);
        Button biography = findViewById(R.id.biography);

        fal.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), FalActivity.class);
            startActivity(i);
        });

        biography.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(), BiographyActivity.class);
            startActivity(i);
        });
    }
}