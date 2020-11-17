package com.example.projecttechlog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.Spinner;

public class MAKE extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
   Button bnext,bprev,bexit;
   Spinner s1,s2,s3,s4,s5,s6,s7,s8,s9;
   Integer[] items = new Integer[]{1,2,3,4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make);
        Spinner s1 = findViewById(R.id.spinner1);
        Spinner s2 = findViewById(R.id.spinner2);
        Spinner s3 = findViewById(R.id.spinner3);
        Spinner s4 = findViewById(R.id.spinner4);
        Spinner s5 = findViewById(R.id.spinner5);
        Spinner s6 = findViewById(R.id.spinner6);
        Spinner s7 = findViewById(R.id.spinner7);
        Spinner s8 = findViewById(R.id.spinner8);
        Spinner s9 = findViewById(R.id.spinner9);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.numbers, android.R.layout.simple_spinner_item );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(this);
        s2.setAdapter(adapter);
        s2.setOnItemSelectedListener(this);
        s3.setAdapter(adapter);
        s3.setOnItemSelectedListener(this);
        s4.setAdapter(adapter);
        s4.setOnItemSelectedListener(this);
        s5.setAdapter(adapter);
        s5.setOnItemSelectedListener(this);
        s6.setAdapter(adapter);
        s6.setOnItemSelectedListener(this);
        s7.setAdapter(adapter);
        s7.setOnItemSelectedListener(this);
        s8.setAdapter(adapter);
        s8.setOnItemSelectedListener(this);
        s9.setAdapter(adapter);
        s9.setOnItemSelectedListener(this);




    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}