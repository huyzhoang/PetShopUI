package com.example.wolfsoft2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.SavedAdapterRecycler;
import model.FavoriteModel;

public class SavedActivity extends AppCompatActivity {

    Integer[] img = {R.drawable.vet,R.drawable.vet};
    String[] TEXT = {"textrecycler","textrecycler1","textrecycler2"};



    private SavedAdapterRecycler adapterRecycler;
    private RecyclerView recyclerView;
    private ArrayList<FavoriteModel> modelRecyclerArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SavedActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelRecyclerArrayList = new ArrayList<>();
//        for (int i = 0; i < (img.length);i++) {
//            ModelRecycler modelRecycler = new ModelRecycler();
//            modelRecycler.setImg1(img[i]);
//            modelRecycler.setImga2(img[i]);
//            modelRecycler.setText(TEXT[i]);
//
//
//            modelRecyclerArrayList.add(modelRecycler);

        FavoriteModel model = new FavoriteModel(R.drawable.vet,"Shop Huy Hoàng","11 Trường Chinh","11 đánh giá");
            modelRecyclerArrayList.add(model);
        FavoriteModel model1 = new FavoriteModel(R.drawable.vet,"Shop Huy Hoàng","11 Trường Chinh","11 đánh giá");
        FavoriteModel model2 = new FavoriteModel(R.drawable.vet,"Shop Huy Hoàng","11 Trường Chinh","11 đánh giá");
        FavoriteModel model3 = new FavoriteModel(R.drawable.vet,"Shop Huy Hoàng","11 Trường Chinh","11 đánh giá");
        modelRecyclerArrayList.add(model1);

        modelRecyclerArrayList.add(model2);

        modelRecyclerArrayList.add(model3);

        adapterRecycler = new SavedAdapterRecycler(SavedActivity.this, modelRecyclerArrayList);
        recyclerView.setAdapter(adapterRecycler);

    }

    }

