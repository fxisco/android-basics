package com.example.francisco.musicalstructure.ui.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private String mSectionsTitles[];

    public HomePagerAdapter(FragmentManager fm, String[] sectionsTitles) {
        super(fm);
        this.mSectionsTitles = sectionsTitles;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new HomeSongsFragment();
        Bundle args = new Bundle();
        args.putInt(HomeSongsFragment.ARG_OBJECT, position + 1);
        fragment.setArguments(args);

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
