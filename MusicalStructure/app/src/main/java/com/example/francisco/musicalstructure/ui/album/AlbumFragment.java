package com.example.francisco.musicalstructure.ui.album;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.francisco.musicalstructure.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {


    public AlbumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_album, container, false);
        TextView album = (TextView) view.findViewById(R.id.album_text_view);

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AlbumActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
