package com.example.wolfsoft2.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import adapter.DetailSearchAdapter;
import adapter.ShopDetailSlidePagerAdapter;
import me.relex.circleindicator.CircleIndicator;
import model.DetailSearchModel;

public class DetailSearchActivity extends AppCompatActivity {

    Integer[] FoodImage_Id = {R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    Integer[] Food_13_Image_Id={R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    //String[] Food5_RestaurantName_Id2 = {"Cocobolo Poolside Bar + Grill","The White Rabbit","Burlamacco Ristorante"};

    private RecyclerView recyclerView;
    private DetailSearchAdapter _detail_Search_adapter;
    private ArrayList<DetailSearchModel> modelArrayList;


//viewpager code

    private ShopDetailSlidePagerAdapter loginPagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopdetail);


        recyclerView = findViewById(R.id.RecyclerView_Food5_Detail_Id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DetailSearchActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();


        for (int i=0;i<FoodImage_Id.length;i++){
            DetailSearchModel _detail_Search_model = new DetailSearchModel(FoodImage_Id[i],Food_13_Image_Id[i]);

            modelArrayList.add(_detail_Search_model);

        }
        _detail_Search_adapter = new DetailSearchAdapter(DetailSearchActivity.this,modelArrayList);
        recyclerView.setAdapter(_detail_Search_adapter);

//Recycle 2
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(DetailSearchActivity.this);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


        viewPager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        loginPagerAdapter = new ShopDetailSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(loginPagerAdapter);
        indicator.setViewPager(viewPager);
        loginPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());

    }
}
