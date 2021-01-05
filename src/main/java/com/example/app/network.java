package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class network extends AppCompatActivity {
Toolbar toolbar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network);
        toolbar3=findViewById(R.id.toolbar3);
        toolbar3.setTitle("Network Page");

    }
}