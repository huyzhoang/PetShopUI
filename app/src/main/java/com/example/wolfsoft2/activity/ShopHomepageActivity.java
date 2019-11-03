package com.example.wolfsoft2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import model.ModelShop;
import adapter.HomepageShopAdapter;

import java.util.ArrayList;


public class ShopHomepageActivity extends AppCompatActivity {

    /*Suggested for you recyerview data*/

    private ArrayList<ModelShop> modelShopModelClasses;
    private RecyclerView recyclerView;
    private HomepageShopAdapter bAdapter;

    private Integer shop_img_best[] = {R.drawable.pet2,R.drawable.pet2,R.drawable.pet2,R.drawable.pet2};
    private String shop_name_best[] = {"Shop Huy Hoang","Shop Quoc Vu","Shop Thu Thao","Shop Hoang Nam"};


    /*Discount recyerview data*/

    private ArrayList<ModelShop> modelShopModelClasses1;
    private RecyclerView recyclerView1;
    private HomepageShopAdapter bAdapter1;

    private Integer shop_img_discount[] = {R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    private String shop_name_discount[] = {"Shop ABC","Shop XYZ","Shop QWERTY","Shop ASD"};



    /*Nearby recyerview data*/

    private ArrayList<ModelShop> modelShopModelClasses2;
    private RecyclerView recyclerView2;
    private HomepageShopAdapter bAdapter2;

    private Integer shop_img_nearby[] = {R.drawable.pet1,R.drawable.pet1,R.drawable.pet1,R.drawable.pet1};
    private String shop_name_nearby[] = {"Shop 1","Shop 2","Shop 3","Shop 4"};


    /*Reviewed shops recyerview data*/

    private ArrayList<ModelShop> modelShopModelClasses3;
    private RecyclerView recyclerView3;
    private HomepageShopAdapter bAdapter3;

    private Integer shop_img_review[] = {R.drawable.pet2,R.drawable.pet2,R.drawable.pet2,R.drawable.pet2};
    private String shop_name_review[] = {"Shop AAA","Shop BBB","Shop CCC","Shop DDD"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_homepage);


        /*Suggested For You shop recyclerview code*/

        recyclerView = findViewById(R.id.RecyclerViewBestShop);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ShopHomepageActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelShopModelClasses = new ArrayList<>();

        for (int i = 0; i < shop_img_best.length; i++) {
            ModelShop model = new ModelShop(shop_img_best[i],shop_name_best[i]);
            modelShopModelClasses.add(model);
        }
        bAdapter = new HomepageShopAdapter(ShopHomepageActivity.this, modelShopModelClasses);
        recyclerView.setAdapter(bAdapter);

        /*Discount shop recyclerview code*/

        recyclerView1 = findViewById(R.id.RecyclerViewDiscount);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(ShopHomepageActivity.this);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        modelShopModelClasses1 = new ArrayList<>();

        for (int i = 0; i < shop_img_discount.length; i++) {
            ModelShop model = new ModelShop(shop_img_discount[i],shop_name_discount[i]);
            modelShopModelClasses1.add(model);
        }
        bAdapter1 = new HomepageShopAdapter(ShopHomepageActivity.this, modelShopModelClasses1);
        recyclerView1.setAdapter(bAdapter1);


        /*Nearby shop recyclerview code */

        recyclerView2 = findViewById(R.id.RecyclerViewNearby);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(ShopHomepageActivity.this);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());

        modelShopModelClasses2 = new ArrayList<>();

        for (int i = 0; i < shop_img_nearby.length; i++) {
            ModelShop model = new ModelShop(shop_img_nearby[i],shop_name_nearby[i]);
            modelShopModelClasses2.add(model);
        }
        bAdapter2 = new HomepageShopAdapter(ShopHomepageActivity.this, modelShopModelClasses2);
        recyclerView2.setAdapter(bAdapter2);



        /*top Reviewed shop recyclerview code */

        recyclerView3 = findViewById(R.id.RecyclerViewTopReview);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(ShopHomepageActivity.this);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView3.setItemAnimator(new DefaultItemAnimator());

        modelShopModelClasses3 = new ArrayList<>();
        for (int i = 0; i < shop_img_review.length; i++) {
            ModelShop model = new ModelShop(shop_img_review[i],shop_name_review[i]);
            modelShopModelClasses3.add(model);
        }
        bAdapter3 = new HomepageShopAdapter(ShopHomepageActivity.this, modelShopModelClasses3);
        recyclerView3.setAdapter(bAdapter3);


    }


}