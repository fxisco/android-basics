package com.example.francisco.musicalstructure.ui.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.francisco.musicalstructure.ui.album.AlbumFragment;
import com.example.francisco.musicalstructure.ui.artist.ArtistFragment;
import com.example.francisco.musicalstructure.ui.playlist.PlaylistFragment;
import com.example.francisco.musicalstructure.ui.songs.SongsFragment;

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private String mSectionsTitles[];

    /**
     * Holds the fragments index.
     */
    private static final int INDEX_SONGS = 0;
    private static final int INDEX_PLAYLIST = 1;
    private static final int INDEX_ALBUM = 2;
    private static final int INDEX_ARTIST = 3;


    public HomePagerAdapter(FragmentManager fm, String[] sectionsTitles) {
        super(fm);
        this.mSectionsTitles = sectionsTitles;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        switch (position) {
            case INDEX_SONGS:
                fragment = new SongsFragment();
                break;
            case INDEX_PLAYLIST:
                fragment = new PlaylistFragment();
                break;
            case INDEX_ALBUM:
                fragment = new AlbumFragment();
                break;
            case INDEX_ARTIST:
                fragment = new ArtistFragment();
                break;
            default:
                fragment = new SongsFragment();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return mSectionsTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mSectionsTitles[position];
    }
}
