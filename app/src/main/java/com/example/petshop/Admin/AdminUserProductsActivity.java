package com.example.petshop.Admin;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.petshop.Model.Card;
import com.example.petshop.R;
import com.example.petshop.ViewHolder.CardViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminUserProductsActivity extends AppCompatActivity {

    private RecyclerView productsList;
    RecyclerView.LayoutManager layoutManager;
    private DatabaseReference cardListRef;

    private String userID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_user_products);

        userID = getIntent().getStringExtra("uid");
        productsList=findViewById(R.id.products_list);
        productsList.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        productsList.setLayoutManager(layoutManager);

        cardListRef = FirebaseDatabase.getInstance().getReference()
                .child("Card List").child("Admin View").child(userID).child("Products");


    }

    @Override
    protected void onStart() {

        super.onStart();

        FirebaseRecyclerOptions<Card> options =
                new FirebaseRecyclerOptions.Builder<Card>()
                        .setQuery(cardListRef, Card.class)
                        .build();
        FirebaseRecyclerAdapter<Card, CardViewHolder> adapter=new FirebaseRecyclerAdapter<Card, CardViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull CardViewHolder holder, int position, @NonNull Card model) {
                holder.txtProductQuantity.setText("Quantity = " + model.getQuantity());
                holder.txtProductPrice.setText("Price" + model.getPrice() + "$");
                holder.txtProductName.setText(model.getPname()); // to display things

            }

            @NonNull
            @Override
            public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items_layout, parent, false);
                CardViewHolder holder = new CardViewHolder(view);
                return holder;
            }
        };
        productsList.setAdapter(adapter);
        adapter.startListening();


    }
}



















