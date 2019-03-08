package com.example.aplikasidaftarfilm.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplikasidaftarfilm.R;

public class DetailMovieActivity extends AppCompatActivity {
    TextView MovieTitle;
    ImageView MoviePoster;
    TextView Overview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        MovieTitle = findViewById(R.id.tv_movieTitle);
        Overview = findViewById(R.id.tv_overview);
        MoviePoster = findViewById(R.id.moviePoster);

        String title = getIntent().getStringExtra("Title");
        String overview = getIntent().getStringExtra("Overview");
        int poster = getIntent().getIntExtra("Poster", 0);

        MovieTitle.setText(title);
        Overview.setText(overview);
        MoviePoster.setImageResource(poster);

    }
}
