package com.example.francisco.musicalstructure.ui.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.francisco.musicalstructure.R;

public class HomeActivity extends AppCompatActivity {

    ViewPager mPager;
    HomePagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String sectionsTitles[] = getResources().getStringArray(R.array.sections);
        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new HomePagerAdapter(getSupportFragmentManager(), sectionsTitles);
        mPager.setAdapter(mAdapter);
    }

}
