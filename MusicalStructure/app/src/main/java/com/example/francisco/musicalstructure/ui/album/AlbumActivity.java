package com.example.francisco.musicalstructure.ui.album;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.francisco.musicalstructure.R;
import com.example.francisco.musicalstructure.ui.songs.SongActivity;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        TextView albumSong = (TextView) findViewById(R.id.album_song_text_view);

        albumSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SongActivity.class);
                startActivity(intent);
            }
        });
    }
}
