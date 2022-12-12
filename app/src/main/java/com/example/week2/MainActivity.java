package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =findViewById(R.id.startBtn);

        button.setOnClickListener(view ->  {
            Intent redirectIntent= new Intent(MainActivity.this, NewAccount.class);
            startActivity(redirectIntent);
        });
    }
}