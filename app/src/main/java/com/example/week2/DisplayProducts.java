package com.example.week2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Account passedName = (Account) getIntent().getSerializableExtra("acct_object");

        TextView greet = findViewById(R.id.greeting);
        greet.setText(getString(R.string.hello, greet));

        TextView headItem = findViewById(R.id.tvHeading);
        ImageView imageItem = findViewById(R.id.imageView);
        TextView subItem = findViewById(R.id.tvSubHeading);

    }
}
