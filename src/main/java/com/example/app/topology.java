package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class topology extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topology);
        toolbar = findViewById(R.id.toolbar4);
        toolbar.setTitle("Topology");
        setSupportActionBar(toolbar);

    }
}