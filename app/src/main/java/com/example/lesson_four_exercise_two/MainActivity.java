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

        View jokes = findViewById(R.id.tvJokes);
        jokes.setOnClickListener(view -> contentJokes());

    }
    public void aboutAuthor(){
        Intent intent = new Intent(this, AboutAuthor.class);
        startActivity(intent);
    }

    public void contentJokes(){
        Intent intent = new Intent(this, Jokes.class);
        startActivity(intent);
    }
}