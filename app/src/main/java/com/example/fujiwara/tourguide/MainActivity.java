package com.example.fujiwara.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.fujiwara.tourguide.fragments.MuseumsFragment;
import com.example.fujiwara.tourguide.fragments.ParksFragment;
import com.example.fujiwara.tourguide.fragments.PubsFragment;
import com.example.fujiwara.tourguide.fragments.ToursFragment;


public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each
        // section of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // Returns current tabs
            switch (position) {
                case 0:
                    PubsFragment tab1 = new PubsFragment();
                    return tab1;
                case 1:
                    ParksFragment tab2 = new ParksFragment();
                    return tab2;
                case 2:
                    ToursFragment tab3 = new ToursFragment();
                    return tab3;
                case 3:
                    MuseumsFragment tab4 = new MuseumsFragment();
                    return tab4;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Pubs";
                case 1:
                    return "Parks";
                case 2:
                    return "Tours";
                case 3:
                    return "Museums";
            }
            return null;
        }
    }
}