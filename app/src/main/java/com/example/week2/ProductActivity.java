package com.example.week2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Products> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Products> productList = new ArrayList<>();

        productList.add(new Products(R.drawable.frappuccino,"Frappuccino",5.77));
        productList.add(new Products(R.drawable.black_coffee,"Black coffee",2.50));
        productList.add(new Products(R.drawable.cappuccino,"Cappuccino",4.99));
        productList.add(new Products(R.drawable.expresso_coffee,"Expresso",3.50));
        productList.add(new Products(R.drawable.double_espresso,"Double Espresso",5.10));
        productList.add(new Products(R.drawable.iced_latte_cafe,"Iced Latte",4.35));
        productList.add(new Products(R.drawable.mocha_latte,"Mocha Latte",5.99));
        productList.add(new Products(R.drawable.salted_caramel_macchiato,"Caramel Macchiato",6.50));
        productList.add(new Products(R.drawable.viennesse_coffee,"Viennesse",6.35));
        productList.add(new Products(R.drawable.flat_white,"Flat white",3.10));
        productList.add(new Products(R.drawable.cortado_coffee,"Cortado",3.99));
        productList.add(new Products(R.drawable.cafe_au_lait,"Cafe au lait",2.99));


        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(mAdapter);


    }

}
