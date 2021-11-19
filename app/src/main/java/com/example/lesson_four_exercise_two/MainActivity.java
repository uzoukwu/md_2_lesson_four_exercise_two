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

        View pictures = findViewById(R.id.tvPictures);
        pictures.setOnClickListener(view -> contentPictures());

        View quotes = findViewById(R.id.tvQuotes);
        quotes.setOnClickListener(view -> contentQuotes());

        View facts = findViewById(R.id.tvFacts);
        facts.setOnClickListener(view -> contentFacts());

        View emotion = findViewById(R.id.tvEmotionImages);
        emotion.setOnClickListener(view -> contentEmotion());

        View sea = findViewById(R.id.tvSeaImages);
        sea.setOnClickListener(view -> contentSea());




    }
    public void aboutAuthor(){
        Intent intent = new Intent(this, AboutAuthor.class);
        startActivity(intent);
    }

    public void contentJokes(){
        Intent intent = new Intent(this, Jokes.class);
        startActivity(intent);
    }

    public void contentPictures(){
        Intent intent = new Intent(this, Pictures.class);
        startActivity(intent);
    }

    public void contentQuotes(){
        Intent intent = new Intent(this, Quotes.class);
        startActivity(intent);
    }

    public void contentFacts(){
        Intent intent = new Intent(this, Facts.class);
        startActivity(intent);
    }

    public void contentEmotion(){
        Intent intent = new Intent(this, Emotion.class);
        startActivity(intent);
    }

    public void contentSea(){
        Intent intent = new Intent(this, Sea.class);
        startActivity(intent);
    }
}