package com.example.movies_app.horrorMovieList;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.movies_app.Movie;
import com.example.movies_app.R;

public class Friday extends AppCompatActivity {

    public static final String keyObj = "KEY_OBJ";
    private TextView name,sinopsys,date,distribution,nomination,budget,director;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);

        name = findViewById(R.id.title);
        sinopsys = findViewById(R.id.sinopsis);
        date = findViewById(R.id.tanggal);
        distribution = findViewById(R.id.distributor);
        nomination = findViewById(R.id.nomination);
        budget = findViewById(R.id.anggaran);
        director = findViewById(R.id.sutrada);
        button = findViewById(R.id.buttonFriday);

        Movie movie;
        if (Build.VERSION.SDK_INT > 33){
            movie = getIntent().getParcelableExtra(keyObj, Movie.class);
        }else {
            movie = getIntent().getParcelableExtra(keyObj);
        }

        name.setText(movie.getName());
        sinopsys.setText("Sinopsis: " + movie.getSinopsys());
        date.setText("Tanggal rilis: " + movie.getDate());
        distribution.setText("Didistribusikan: " + movie.getDistribution());
        nomination.setText("Nominasi: " + movie.getNomination());
        budget.setText("Anggaran :" + movie.getBudget());
        director.setText("Sutradara: " + movie.getDirector());

        button.setOnClickListener(click -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareMessage = movie.getName();
            intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(intent, "Bagikan melalui"));
        });
    }
}