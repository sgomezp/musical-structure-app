package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalapp.R.id.buttonAlbums;
import static com.example.android.musicalapp.R.id.buttonArtists;

/**
 * Created by sgomezp on 06/05/2017.
 */

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the Artists Button menu
        TextView artist = (TextView) findViewById(buttonArtists);

        // Set  a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the artists button menu is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistIntent = new Intent(SongsActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the Albums Button menu
        TextView album = (TextView) findViewById(buttonAlbums);

        // Set  a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the album button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent albumIntent = new Intent(SongsActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

    }
}
