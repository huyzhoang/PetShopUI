package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wolfsoft2.activity.R;

import java.util.ArrayList;

import model.ModelSearch;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ModelSearch> modelArrayList;

    public SearchAdapter(Context context, ArrayList<ModelSearch> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelSearch search_model = modelArrayList.get(position);

        holder.ShopNameId.setText(search_model.getShopNameId());
        holder.ShopAddressId.setText(search_model.getShopAddressId());
        holder.ShopImageId.setImageResource(search_model.getShopImageId());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView ShopNameId, ShopAddressId;
        ImageView ShopImageId;

        public ViewHolder(View itemView) {
            super(itemView);
            ShopNameId = itemView.findViewById(R.id.shop_name);
            ShopAddressId = itemView.findViewById(R.id.shop_address);
            ShopImageId = itemView.findViewById(R.id.shop_img);
        }
    }
}
