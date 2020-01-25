package com.example.spotiflydayone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openSongsActivity(View view){

        Log.d("main", "launching activity : Songs" );
        Intent intent = new Intent(this, SongsActivity.class);
        intent.putExtra("msg", "Songs are here!");
        intent.putExtra("title", "Songs");
        startActivity(intent);

    }

    public void openAlbumsActivity(View view){

        Log.d("main", "launching activity : Albums" );
        Intent intent = new Intent(this, AlbumsActivity.class);
        intent.putExtra("msg", "Albums Activity!");
        intent.putExtra("title", "Albums");
        startActivity(intent);

    }

    public void openGenresActivity(View view){

        Log.d("main", "launching activity : Genres" );
        Intent intent = new Intent(this, GenresActivity.class);
        intent.putExtra("msg", "Generes are here!");
        intent.putExtra("title", "Genres");
        startActivity(intent);

    }

    public void openArtistsActivity(View view){

        Log.d("main", "launching activity : Artists" );
        Intent intent = new Intent(this, ArtistActivity.class);
        intent.putExtra("msg", "Here are some artists");
        intent.putExtra("title", "Artists");
        startActivity(intent);

    }
}
