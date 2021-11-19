package com.example.lesson_four_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}