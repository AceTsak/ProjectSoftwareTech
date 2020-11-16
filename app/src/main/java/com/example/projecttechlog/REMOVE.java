package com.example.projecttechlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class REMOVE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}