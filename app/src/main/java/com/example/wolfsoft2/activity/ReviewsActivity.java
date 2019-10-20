package com.example.wolfsoft2.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.ReviewsAdapter;
import model.ReviewsModel;

public class ReviewsActivity extends AppCompatActivity {
    TextView textView;

    private ArrayList<ReviewsModel> modelRecyclerFood14ArrayList;
    private RecyclerView recyclerview;
    private ReviewsAdapter adapter_recyclerfood14;

    String foodtext1[] = {"Nguyễn Thị Linh","Nguyễn Thị Mai","Nguyễn Văn Long"};
    String foodtext2[] = {"2 giờ trước","2 giờ trước","2 giờ trước"};
    String foodtext3[] = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.","Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."};
    String foodtext4[] = {"25 đánh giá","5 đánh giá","10 đánh giá"};


    Integer circleviewimg1[] = {R.drawable.girlavatar,R.drawable.girlavatar2,R.drawable.girlavatar};
    Integer foodimg1[] = {R.drawable.pet1,R.drawable.pet2,R.drawable.pet1};
    Integer foodimg2[] = {R.drawable.pet1,R.drawable.pet2,R.drawable.pet1};
    Integer foodimg3[] = {R.drawable.pet1,R.drawable.pet2,R.drawable.pet1};
    Integer foodimg4[] = {R.drawable.pet1,R.drawable.pet2,R.drawable.pet1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( ReviewsActivity.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        modelRecyclerFood14ArrayList = new ArrayList<>();


        for (int i = 0; i < foodimg1.length; i++) {
            ReviewsModel view1 = new ReviewsModel(foodtext1[i],foodtext2[i],foodtext3[i],foodtext4[i],circleviewimg1[i],foodimg1[i],foodimg2[i],foodimg3[i],foodimg4[i]);
            modelRecyclerFood14ArrayList.add(view1);
        }
        adapter_recyclerfood14 = new ReviewsAdapter(ReviewsActivity.this,modelRecyclerFood14ArrayList);
        recyclerview.setAdapter(adapter_recyclerfood14);


    }

}

