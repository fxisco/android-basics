package com.example.francisco.musicalstructure.ui.playlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.francisco.musicalstructure.R;
import com.example.francisco.musicalstructure.ui.songs.SongActivity;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView artistSong = (TextView) findViewById(R.id.playlist_song_text_view);

        artistSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SongActivity.class);
                startActivity(intent);
            }
        });
    }
}
