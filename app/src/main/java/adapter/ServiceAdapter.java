package adapter;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.wolfsoft2.activity.R;
import model.ModelShopService;

public class ServiceAdapter extends RecyclerView.Adapter<ServiceAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<ModelShopService> modelShopServices;
    private String serviceName;

    private String discountValue;
    private String serviceSalePrice;
    private String price;
    private int excuteTime;

    public ServiceAdapter(Context mContext, ArrayList<ModelShopService> modelShopServices) {
        this.mContext = mContext;
        this.modelShopServices = modelShopServices;
    }




    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_service,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        //show item

        serviceName = modelShopServices.get(position).getModelService().getServiceName();
        discountValue = modelShopServices.get(position).getModelDiscount().getDiscountValue() + "";
        price = modelShopServices.get(position).getPrice() + "";
        serviceSalePrice = getSalePrice(price, discountValue);

        holder.txtSalonServiceName.setText(uppercaseFirstLetter(serviceName) + " (-" + discountValue + "%)");
        holder.txtPrice.setText(price + "k");
        holder.txtSalePrice.setText(serviceSalePrice);
        holder.txtExecuteTime.setText(excuteTime + " phút");

    }

    public String getSalePrice(String price,String discountValue){

        int nSalePrice = Integer.parseInt(price);
        int nDiscountValue = Integer.parseInt(discountValue);
        nSalePrice = nSalePrice - (nSalePrice * nDiscountValue / 100);

        return "" + nSalePrice + "K";
    }

    public String uppercaseFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    @Override
    public int getItemCount() {
        return modelShopServices.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        TextView txtSalonServiceName;
        TextView txtPrice;
        TextView txtSalePrice;
        TextView txtExecuteTime;
        CheckBox chkBox;

        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            txtSalonServiceName = itemView.findViewById(R.id.service_name);
            txtPrice = itemView.findViewById(R.id.txt_service_price);
            txtSalePrice = itemView.findViewById(R.id.txt_service_sale_price);
            cardView = itemView.findViewById(R.id.card_view_service);

            txtPrice.setPaintFlags(txtPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }



        @Override
        public void onClick(View v) {

        }
    }
}

