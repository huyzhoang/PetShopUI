package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wolfsoft2.activity.R;
import java.util.ArrayList;
import model.DetailSearchModel;

public class DetailSearchAdapter extends RecyclerView.Adapter<DetailSearchAdapter.ViewHolder> {

    Context context;
    private ArrayList<DetailSearchModel> modelArrayList;

    public DetailSearchAdapter(Context context, ArrayList<DetailSearchModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public DetailSearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shopdetail,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailSearchAdapter.ViewHolder holder, int position) {
        DetailSearchModel _detail_Search_model = modelArrayList.get(position);
        holder.FoodImage_Id.setImageResource(_detail_Search_model.getFoodImage_Id());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView FoodImage_Id;
        public ViewHolder(View itemView) {
            super(itemView);

            FoodImage_Id = itemView.findViewById(R.id.FoodImage_Id);
        }
    }
}
