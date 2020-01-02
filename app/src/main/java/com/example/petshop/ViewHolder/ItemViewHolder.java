package com.example.petshop.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.petshop.Interface.ItemClickListener;
import com.example.petshop.R;


public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtProductName, txtProductDescription, txtProductPrice, txtProductStatus;
    public ImageView imageView;
    public ItemClickListener listener;


    public ItemViewHolder(@NonNull View itemView) { //constructure
        super(itemView);

        imageView = itemView.findViewById(R.id.product_seller_image);
        txtProductName = itemView.findViewById(R.id.seller_product_name);
        txtProductDescription =  itemView.findViewById(R.id.product_seller_description);
        txtProductPrice =  itemView.findViewById(R.id.product_seller_price);
        txtProductStatus = itemView.findViewById(R.id.product_seller_state);


    }

    public void setItemClickListener(ItemClickListener listener) {

        this.listener = listener;
    }


    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition(), false);
    }


}

