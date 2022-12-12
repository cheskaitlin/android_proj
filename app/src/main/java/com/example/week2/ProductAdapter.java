package com.example.week2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {
    ArrayList<Products> productList;

    public ProductAdapter(ArrayList<Products> productList){
        this.productList = productList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView txtbrand, txtprice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.imageView);
            this.txtbrand = itemView.findViewById(R.id.tvHeading);
            this.txtprice = itemView.findViewById(R.id.tvSubHeading);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Products products = productList.get(position);
        holder.imageView.setImageResource(products.getImage());
        holder.txtbrand.setText(products.getModel());
        holder.txtprice.setText(String.valueOf("$" + products.getPrice()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}

