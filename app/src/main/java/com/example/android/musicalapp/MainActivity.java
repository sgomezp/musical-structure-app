package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.musicalapp.R.id.albums;
import static com.example.android.musicalapp.R.id.artists;
import static com.example.android.musicalapp.R.id.songs;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Artist menu
        TextView artist = (TextView) findViewById(artists);

        // Set  a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the artists menu is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });


        //Albums

        // Find the View that shows the Albums menu
        TextView album = (TextView) findViewById(albums);

        // Set  a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the album menu is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });


        // Songs

        // Find the View that shows the Songs menu
        TextView song = (TextView) findViewById(songs);

        // Set  a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be execute when the song menu is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });


    }
}
