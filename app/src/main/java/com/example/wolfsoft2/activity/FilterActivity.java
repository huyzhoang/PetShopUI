package com.example.wolfsoft2.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import model.Shop;

import java.util.ArrayList;


public class FilterActivity extends AppCompatActivity {

    private ArrayList<Shop> shopListModelClass;
    private RecyclerView recyclerView;


    private String txt[]={"Distance","Reviews","Discount"};

    Dialog slideDialog;
    ImageView filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);


        filter = findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}
