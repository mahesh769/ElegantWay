package com.elegantway;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.elegantway.fragments.SplashLogin;
import com.elegantway.fragments.WelcomePage;
import com.elegantway.fragments.YouCanOfferComment;

import me.relex.circleindicator.CircleIndicator;


public class FullscreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_fullscreen);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);


        ViewPager mPager = (ViewPager) findViewById(R.id.viewpager);
        ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());

        mPager.setAdapter(mPagerAdapter);
        indicator.setViewPager(mPager);
    }

    private class ScreenSlidePagerAdapter extends FragmentPagerAdapter {
        private static final int NUM_PAGES = 3;
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new WelcomePage();
                case 1:
                    return new YouCanOfferComment();
                case 2:
                    return new SplashLogin();


                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }


}
