package com.example.lesson_four_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View author = findViewById(R.id.tvAuthor);
        author.setOnClickListener(view -> aboutAuthor());

    }
    public void aboutAuthor(){
        Intent intent = new Intent(this, AboutAuthor.class);
        startActivity(intent);
    }
}