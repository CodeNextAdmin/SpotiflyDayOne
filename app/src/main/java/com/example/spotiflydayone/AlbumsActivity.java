package com.example.spotiflydayone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        //inside onCreate
        message = findViewById(R.id.albums_txt_view);
        Bundle bundle = getIntent().getExtras();
        String msg = (String)bundle.get("msg");
        String title = (String)bundle.get("title");

        this.setTitle(title);
        message.setText(msg);


    }
}
