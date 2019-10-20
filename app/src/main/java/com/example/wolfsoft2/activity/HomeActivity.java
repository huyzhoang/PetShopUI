package com.example.wolfsoft2.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import model.Shop;
import model.ShopHomeServiceModel;
import model.ShopHomeItem;
import adapter.HomeShopListAdapter;
import adapter.HomeShopServicesAdapter;

import java.util.ArrayList;


public class HomeActivity extends AppCompatActivity {

    /*Home For you recyerview data*/

    private ArrayList<ShopHomeItem> shopHomeItemModelClasses;
    private RecyclerView recyclerView;
    private HomeShopListAdapter bAdapter;

    private ArrayList<Shop> shopListModelClass;

    private String txt[]={"Distance","Reviews","Discount"};

    Dialog slideDialog;
    ImageView filter;
    CardView pickShop;

    private Integer image[] = {R.drawable.pet2,R.drawable.pet2,R.drawable.pet2,R.drawable.pet2};
    private String title[] = {"Shop Huy Hoang","Shop Quoc Vu","Shop Thu Thao","Shop Gia Cuong"};

    /*Cate*/
    private HomeShopServicesAdapter homeShopServicesAdapter;
    private ArrayList<ShopHomeServiceModel> shopHomeServiceModels;
    Integer resimage[]={R.drawable.bath,R.drawable.worms,R.drawable.hair,R.drawable.medicine};
    String  txtregulargift[]={"Bathing","Deworming","Grooming","Medicine"};

    /*Home Discount recyerview data*/

    private ArrayList<ShopHomeItem> shopHomeItemModelClasses1;
    private RecyclerView recyclerView1;
    private HomeShopListAdapter bAdapter1;

    private Integer image1[] = {R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    private String title1[] = {"Shop ABC","Shop XYZ","Shop QWERTY","Shop ASD"};



    /*Home Nearby recyerview data*/

    private ArrayList<ShopHomeItem> shopHomeItemModelClasses2;
    private RecyclerView recyclerView2;
    private HomeShopListAdapter bAdapter2;

    private Integer image2[] = {R.drawable.pet1,R.drawable.pet1,R.drawable.pet1,R.drawable.pet1};
    private String title2[] = {"Shop 1","Shop 2","Shop 3","Shop 4"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_homepage);

        filter = findViewById(R.id.filter);

        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        /*Home For You  recyclerview code*/

        recyclerView = findViewById(R.id.RecyclerViewForYou);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        shopHomeItemModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            ShopHomeItem mycreditList = new ShopHomeItem(image[i],title[i]);
            shopHomeItemModelClasses.add(mycreditList);
        }
        bAdapter = new HomeShopListAdapter(HomeActivity.this, shopHomeItemModelClasses);
        recyclerView.setAdapter(bAdapter);

        /*Cate*/
        recyclerView = findViewById(R.id.RecyclerViewCategory);
        RecyclerView.LayoutManager layoutManager4 = new LinearLayoutManager(HomeActivity.this);
        recyclerView.setLayoutManager(layoutManager4);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        shopHomeServiceModels = new ArrayList<>();

        for (int i = 0; i < resimage.length; i++) {
            ShopHomeServiceModel view = new ShopHomeServiceModel(resimage[i],txtregulargift[i]);
            shopHomeServiceModels.add(view);
        }
        homeShopServicesAdapter = new HomeShopServicesAdapter(HomeActivity.this, shopHomeServiceModels);
        recyclerView.setAdapter(homeShopServicesAdapter);


        /*Home Discount recyclerview code*/

        recyclerView1 = findViewById(R.id.RecyclerViewDiscount);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(HomeActivity.this);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        shopHomeItemModelClasses1 = new ArrayList<>();

        for (int i = 0; i < image1.length; i++) {
            ShopHomeItem mycreditList = new ShopHomeItem(image1[i],title1[i]);
            shopHomeItemModelClasses1.add(mycreditList);
        }
        bAdapter1 = new HomeShopListAdapter(HomeActivity.this, shopHomeItemModelClasses1);
        recyclerView1.setAdapter(bAdapter1);


        /*Home Nearby recyclerview code */

        recyclerView2 = findViewById(R.id.RecyclerViewNearby);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(HomeActivity.this);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());

        shopHomeItemModelClasses2 = new ArrayList<>();

        for (int i = 0; i < image2.length; i++) {
            ShopHomeItem mycreditList = new ShopHomeItem(image2[i],title2[i]);
            shopHomeItemModelClasses2.add(mycreditList);
        }
        bAdapter2 = new HomeShopListAdapter(HomeActivity.this, shopHomeItemModelClasses2);
        recyclerView2.setAdapter(bAdapter2);

        /* pickShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), DetailSearchActivity.class);
                startActivity(intent);
            }
        });
*/
    }


}