package com.example.movies_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.movies_app.horrorMovieList.HororMovie;
import com.example.movies_app.romanceMovieList.RomanceMovie;
import com.example.movies_app.warMovieList.Warmovie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView warImage = findViewById(R.id.warmovie);
        ImageView romanceImage = findViewById(R.id.romance);
        ImageView hororImage = findViewById(R.id.horror);
        warImage.setOnClickListener(click -> {
            Intent intent = new Intent(this, Warmovie.class);
            startActivity(intent);
        });
        romanceImage.setOnClickListener(click -> {
            Intent intent = new Intent(this, RomanceMovie.class);
            startActivity(intent);
        });
        hororImage.setOnClickListener(click -> {
            Intent intent = new Intent(this, HororMovie.class);
            startActivity(intent);
        });
    }
}