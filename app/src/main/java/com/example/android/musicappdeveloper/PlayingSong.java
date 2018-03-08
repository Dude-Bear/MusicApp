package com.example.android.musicappdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingSong extends AppCompatActivity {

    ImageView imageView;
    TextView title, artist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);
        imageView = findViewById(R.id.playing_cover);
        title = (TextView) findViewById(R.id.playing_title);
        artist = (TextView) findViewById(R.id.playing_artist);

        imageView.setImageResource(getIntent().getIntExtra("image",00));
        title.setText(getIntent().getStringExtra("title"));
        artist.setText(getIntent().getStringExtra("artist"));

    }
}
