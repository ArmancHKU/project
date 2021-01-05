package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {
EditText editTextTextPersonName,editTextTextPassword;
CardView cardView;
Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword= findViewById(R.id.editTextTextPassword);
        cardView= findViewById(R.id.cardview);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Login Page");
        setSupportActionBar(toolbar);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,main_page.class);
                startActivity(intent);
            }
        });


    }
}