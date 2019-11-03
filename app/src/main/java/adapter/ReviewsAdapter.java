package adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;


import com.example.wolfsoft2.activity.R;

import java.util.ArrayList;
import java.util.List;

import model.ModelReview;


public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.MyViewHolder> {

        private Context mContext;
        private ArrayList<ModelReview> modelReviews;
        private String cusName;
        private String cusAvt;
        private int rating;
        private String comment;

        public ReviewsAdapter(Context mContext, ArrayList<ModelReview> modelReviews) {
                this.mContext = mContext;
                this.modelReviews = modelReviews;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view;
                LayoutInflater mInflater = LayoutInflater.from(mContext);
                view = mInflater.inflate(R.layout.item_reviews, parent, false);

                return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, final int position) {


        }

        @Override
        public int getItemCount() {
                return modelReviews.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {


                public MyViewHolder(View itemView) {
                        super(itemView);

                }
        }
}
