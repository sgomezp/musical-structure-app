package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalapp.R.id.buttonAlbums;
import static com.example.android.musicalapp.R.id.buttonSongs;

/**
 * Created by sgomezp on 06/05/2017.
 */

public class ArtistsSongsNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists_songs);


        // Find the View that shows the Songs Button menu
        TextView songs = (TextView) findViewById(buttonSongs);

        // Set  a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songIntent = new Intent(ArtistsSongsNamesActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songIntent);
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
                Intent albumIntent = new Intent(ArtistsSongsNamesActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });


    }
}
