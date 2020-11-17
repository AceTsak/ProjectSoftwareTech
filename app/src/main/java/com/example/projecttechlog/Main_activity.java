package com.example.projecttechlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_activity extends AppCompatActivity {
    Button badd,bremove,bmake,bview,blogout,bemp;
    Intent istart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);
        Button badd = findViewById(R.id.buttonadd);
        Button bremove = findViewById(R.id.buttonremove);
        Button bmake = findViewById(R.id.buttonmakesch);
        Button bview = findViewById(R.id.btnViewSch);
        Button blogout = findViewById(R.id.buttonlogout);
        Button bemp = findViewById(R.id.buttonemployee);
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(1);


            }
        });
        bremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(2);


            }
        });
        bmake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(3);


            }
        });
        bview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(4);


            }
        });
        blogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(5);


            }
        });
        bemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity(6);


            }
        });
}
       public void OpenActivity(int i){
        switch(i) {
            case 1:
            istart = new Intent(this, ADD.class);
            startActivity(istart);
            break;
            case 2:
                istart = new Intent(this, REMOVE.class);
                startActivity(istart);
                break;
            case 3:
                istart = new Intent(this, MAKE.class);
                startActivity(istart);
                break;
            case 4:
                istart = new Intent(this, VIEW.class);
                startActivity(istart);
                break;
            case 5:
                istart = new Intent(this, LOGIN.class);
                startActivity(istart);
                break;
            case 6:
                istart = new Intent(this, EMPLOYEE.class);
                startActivity(istart);
                break;
        }

       }




}