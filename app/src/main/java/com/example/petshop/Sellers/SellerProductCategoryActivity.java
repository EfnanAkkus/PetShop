package com.example.petshop.Sellers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.petshop.R;

public class SellerProductCategoryActivity extends AppCompatActivity {

    private ImageView birds, cats, cows, dogs;
    private ImageView fishes, hamsters, horses, rabbits;
    private ImageView sheep, turtles, lizards, snakes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_product_category);



        birds=findViewById(R.id.birds);
        cats=findViewById(R.id.cats);
        cows=findViewById(R.id.cows);
        dogs=findViewById(R.id.dogs);
        fishes=findViewById(R.id.fishes);
        hamsters=findViewById(R.id.hamsters);
        horses=findViewById(R.id.horses);
        rabbits=findViewById(R.id.rabbits);
        sheep=findViewById(R.id.sheep);
        turtles=findViewById(R.id.turtles);
        lizards=findViewById(R.id.lizards);
        snakes=findViewById(R.id.snakes);


        birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "birds");
                startActivity(intent);
            }
        });
        cats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "cats");
                startActivity(intent);
            }
        });
        cows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "cows");
                startActivity(intent);
            }
        });
        dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "dogs");
                startActivity(intent);
            }
        });
        fishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "fishes");
                startActivity(intent);
            }
        });
        hamsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "hamsters");
                startActivity(intent);
            }
        });
        horses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "horses");
                startActivity(intent);
            }
        });
        rabbits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "rabbits");
                startActivity(intent);
            }
        });
        sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "sheep");
                startActivity(intent);
            }
        });
        turtles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "turtles");
                startActivity(intent);
            }
        });
        lizards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "lizards");
                startActivity(intent);
            }
        });
        snakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("category", "snakes");
                startActivity(intent);
            }
        });

    }
}
