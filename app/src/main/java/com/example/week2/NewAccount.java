package com.example.week2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewAccount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_account);
        TextView username = (TextView) findViewById(R.id.userName);
        TextView email = (TextView) findViewById(R.id.userEmail);
        TextView password = (TextView) findViewById(R.id.userPassword);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(view -> {
            String userName = username.getText().toString();
            String eMail = email.getText().toString();
            String passWord = password.getText().toString();

            Account account = new Account(userName, eMail, passWord);

            if(userName.equals(" ") || eMail.equals(" ") || passWord.equals(" ")){
                Toast.makeText(NewAccount.this, "Please fill all the fields", Toast.LENGTH_SHORT);
            }
            else{
                Intent redirectDisplay = new Intent(NewAccount.this, DisplayProducts.class);
                redirectDisplay.putExtra("acct_object", account);
                startActivity(redirectDisplay);
            }
        });

    }
}
