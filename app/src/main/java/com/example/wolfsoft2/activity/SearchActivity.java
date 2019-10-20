package com.example.wolfsoft2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.SearchAdapter;
import model.SearchModel;

public class SearchActivity extends AppCompatActivity {

   String[] ShopNameId = {"Shop Huy Hoàng","Shop Thu Thảo"};
   String[] ShopAddressId = {"12 Trường Chinh","60 Nguyễn Trãi"};
   Integer[] ShopImageId = {R.drawable.vet,R.drawable.vet};

   private RecyclerView recyclerView;
   private ArrayList<SearchModel> modelArrayList;
   private SearchAdapter search_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        recyclerView = findViewById(R.id.RecyclerView_food13_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();

        for (int i = 0; i< ShopNameId.length; i++){
            SearchModel search_model = new SearchModel(ShopNameId[i], ShopAddressId[i], ShopImageId[i]);
            modelArrayList.add(search_model);
        }
        search_adapter = new SearchAdapter(SearchActivity.this,modelArrayList);
        recyclerView.setAdapter(search_adapter);
    }
}
