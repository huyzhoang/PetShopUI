package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft2.activity.R;

import java.util.ArrayList;

import adapter.DetailReviewAdapter;
import model.TopReviewModel;


public class ReviewDetail extends Fragment {

    Integer[] nearbyimg1 = {R.drawable.vet,R.drawable.vet,R.drawable.vet,R.drawable.vet};
    Integer[] nearbyimg2 = {R.drawable.ic_like,R.drawable.ic_like,R.drawable.ic_like,R.drawable.ic_like};

    String[] nearbytext1 = {"Tiệm Huy Hoàng","Tiệm Hoàng Nam","Gia Cường","Tiệm Quốc Vũ"};
    String[] nearbytext2 = {"60 Trường Chinh","47 Nguyễn Kiệm","55 đường D2","833 Cộng Hoà"};
    String[] nearbytext3 = {"23 đánh giá","33 đánh giá","11 đánh giá","9 đánh giá"};


    private DetailReviewAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<TopReviewModel> homepageModelList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nearby,container,false);


        recyclerview = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager( getContext(),2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        homepageModelList = new ArrayList<>();


        for (int i = 0; i < nearbyimg1.length; i++) {
            TopReviewModel view1 = new TopReviewModel(nearbyimg1[i],nearbyimg2[i],nearbytext1[i],nearbytext2[i],nearbytext3[i]);
            homepageModelList.add(view1);
        }
        homepageAdapter = new DetailReviewAdapter(getActivity(),homepageModelList);
        recyclerview.setAdapter(homepageAdapter);

        return view;
    }
}