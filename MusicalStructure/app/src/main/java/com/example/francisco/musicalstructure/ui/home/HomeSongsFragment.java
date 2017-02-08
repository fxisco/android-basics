package com.example.francisco.musicalstructure.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.francisco.musicalstructure.R;

public class HomeSongsFragment extends Fragment {

    public static final String ARG_OBJECT = "object";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_songs, container, false);

        return rootView;

    }
}
