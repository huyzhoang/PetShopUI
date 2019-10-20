package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wolfsoft2.activity.R;

import java.util.ArrayList;

import model.ShopHomeServiceModel;


public class HomeShopServicesAdapter extends RecyclerView.Adapter<HomeShopServicesAdapter.ViewHolder> {
    Context context;
    private ArrayList<ShopHomeServiceModel> shop_home_Cate_model_ArrayList;

    public HomeShopServicesAdapter(Context context, ArrayList<ShopHomeServiceModel> shop_home_Cate_model_ArrayList) {
        this.context = context;
        this.shop_home_Cate_model_ArrayList = shop_home_Cate_model_ArrayList;
    }

    @Override
    public HomeShopServicesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_service_homepage,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeShopServicesAdapter.ViewHolder holder, int position) {
        holder.resimage.setImageResource(shop_home_Cate_model_ArrayList.get(position).getResimage());
        holder.txtregulargift.setText(shop_home_Cate_model_ArrayList.get(position).getTxtregulargift());
    }

    @Override
    public int getItemCount() {
        return shop_home_Cate_model_ArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView resimage;
        TextView txtregulargift;

        public ViewHolder(View itemView) {
            super(itemView);

            resimage=itemView.findViewById(R.id.resimage);
            txtregulargift=itemView.findViewById(R.id.txtregulargift);



        }
    }
}
