package com.example.project_softwaretechnology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EMPLOYEE extends AppCompatActivity
{
    Button btnViewEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        Button btnViewEmployee = findViewById(R.id.btnViewEmployee);

        btnViewEmployee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){ openViewActivity(); }
        });
    }

    public void openViewActivity()
    {
        Intent intent = new Intent(this, VIEW.class);
        startActivity(intent);
    }
}