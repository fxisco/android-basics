package com.example.francisco.musicalstructure.ui.songs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.francisco.musicalstructure.R;

public class SongsFragment extends Fragment {

    public static final String ARG_OBJECT = "object";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_songs, container, false);
        TextView song = (TextView) view.findViewById(R.id.song_text_view);

        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SongActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }
}
