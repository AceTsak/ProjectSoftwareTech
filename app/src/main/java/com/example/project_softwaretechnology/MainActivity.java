package com.example.project_softwaretechnology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
//stuff
=======
public class MainActivity extends AppCompatActivity
{
    Button btnAdd, btnRemove, btnMake, btnView, btnEmployee;
    Intent actStart;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnRemove = findViewById(R.id.btnRemove);
        Button btnMake = findViewById(R.id.btnMake);
        Button btnView = findViewById(R.id.btnView);
        Button btnEmployee = findViewById(R.id.btnEmployee);

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                OpenActivity(1);
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                OpenActivity(2);
            }
        });

        btnMake.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                OpenActivity(3);
            }
        });

        btnView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                OpenActivity(4);
            }
        });

        btnEmployee.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                OpenActivity(5);
            }
        });
    }

}


    public void OpenActivity(int i)
    {
        switch(i)
        {
            case 1:
                actStart = new Intent(this, ADD.class);
                startActivity(actStart);
                break;
            case 2:
                actStart = new Intent(this, REMOVE.class);
                startActivity(actStart);
                break;
            case 3:
                actStart = new Intent(this, MAKE.class);
                startActivity(actStart);
                break;
            case 4:
                actStart = new Intent(this, VIEW.class);
                startActivity(actStart);
                break;
            case 5:
                actStart = new Intent(this, EMPLOYEE.class);
                startActivity(actStart);
                break;
        }
    }




}

