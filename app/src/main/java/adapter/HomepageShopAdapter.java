package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import model.ModelShop;
import com.example.wolfsoft2.activity.R;
import java.util.List;

public class HomepageShopAdapter extends RecyclerView.Adapter<HomepageShopAdapter.MyViewHolder> {

    Context context;
    private List<ModelShop> OfferList;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        public MyViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.shop_img);
            title = (TextView) view.findViewById(R.id.shop_name);
        }

    }

    public HomepageShopAdapter(Context context, List<ModelShop> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HomepageShopAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_shop, parent, false);
        return new HomepageShopAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final ModelShop lists = OfferList.get(position);
        holder.image.setImageResource(lists.getShop_img());
        holder.title.setText(lists.getShop_name());
    }

    @Override
    public int getItemCount() {
        return OfferList.size();
    }

}


