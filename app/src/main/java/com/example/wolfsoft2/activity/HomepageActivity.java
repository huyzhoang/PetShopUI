package com.example.wolfsoft2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.HomepageAdapter;
import adapter.TabofHomepageAdapter;
import model.Homepage_NearbyModel;

public class HomepageActivity extends AppCompatActivity {

    ViewPager viewPager1;
    TabLayout tabLayout1;
    TabofHomepageAdapter adapter;
    TextView txtSearch;

    private HomepageAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<Homepage_NearbyModel> homepageNearbyModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        txtSearch = findViewById(R.id.txt_homepage_search);
        viewPager1 = findViewById(R.id.viewpager1);
        tabLayout1 = findViewById(R.id.tablayout1);

        tabLayout1.addTab(tabLayout1.newTab().setText("Gần đây"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Khuyến mãi"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Đánh giá cao"));

        adapter = new TabofHomepageAdapter(getSupportFragmentManager(),tabLayout1.getTabCount());
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(3);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        txtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

    }

    }

