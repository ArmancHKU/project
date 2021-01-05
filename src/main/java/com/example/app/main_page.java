package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_page extends AppCompatActivity {
Toolbar toolbar;
Button users,topology,network,devices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Main Page");
        setSupportActionBar(toolbar);
        users = findViewById(R.id.users);
        topology = findViewById(R.id.topology);
        network = findViewById(R.id.network);
        devices = findViewById(R.id.devices);
        users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this,users.class);
                startActivity(intent);
            }
        });
        devices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this,devices.class);
                startActivity(intent);
            }
        });
        topology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this,topology.class);
                startActivity(intent);
            }
        });
        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_page.this,network.class);
                startActivity(intent);
            }
        });
    }
}