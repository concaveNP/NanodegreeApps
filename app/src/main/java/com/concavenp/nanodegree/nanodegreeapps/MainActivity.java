package com.concavenp.nanodegree.nanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.spotify_streamer) + " app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button scoresButton = (Button) findViewById(R.id.super_duo_scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.super_duo_scores) + " app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button libraryButton = (Button) findViewById(R.id.super_duo_library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.super_duo_library) + " app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button biggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        biggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.build_it_bigger) + " app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button xyzButton = (Button) findViewById(R.id.xyz_reader);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.xyz_reader) + " app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstone);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This will launch my: " + getResources().getString(R.string.capstone) + " app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
