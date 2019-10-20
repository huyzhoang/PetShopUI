package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import model.ShopHomeItem;
import com.example.wolfsoft2.activity.R;
import java.util.List;

public class HomeShopListAdapter extends RecyclerView.Adapter<HomeShopListAdapter.MyViewHolder> {

    Context context;
    private List<ShopHomeItem> OfferList;
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;
        public MyViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
        }

    }

    public HomeShopListAdapter(Context context, List<ShopHomeItem> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HomeShopListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_shop_homepage, parent, false);
        return new HomeShopListAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final ShopHomeItem lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(context, All_Services_Activity.class);
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return OfferList.size();
    }

}


