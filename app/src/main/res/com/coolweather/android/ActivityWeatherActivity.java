package com.coolweather.android;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ScrollView;
import android.widget.fragment;

public class ActivityWeatherActivity extends Activity  {

    private ImageView bingPicImg;
    private DrawerLayout drawerLayout;
    private SwipeRefreshLayout swipeRefresh;
    private ScrollView weatherLayout;
    private fragment chooseAreaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        bingPicImg = (ImageView) findViewById(R.id.bing_pic_img);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        swipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        weatherLayout = (ScrollView) findViewById(R.id.weather_layout);
        chooseAreaFragment = (fragment) findViewById(R.id.choose_area_fragment);
    }

}
