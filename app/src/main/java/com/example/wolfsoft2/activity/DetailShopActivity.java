package com.example.wolfsoft2.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import me.relex.circleindicator.CircleIndicator;

public class DetailShopActivity extends AppCompatActivity {

    Integer[] FoodImage_Id = {R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    Integer[] Food_13_Image_Id={R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};

    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_detail);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DetailShopActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());


//Recycle 2
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(DetailShopActivity.this);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
