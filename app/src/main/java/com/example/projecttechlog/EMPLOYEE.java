package com.example.projecttechlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EMPLOYEE extends AppCompatActivity {
    Button exit,view;
    Intent istart;

    public Button view;
    public Button exit = findViewById(R.id.buttonviewsch);

    public EMPLOYEE(Object v) {
        this.v = v;
        view = findViewById(R.id.buttonviewsch);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
    }
    view.setOnClickListener(new View.OnClickListener()
    private Object v;
    {
        public void onClick (View v)
        {
            OpenActivity(1);
        }
    }
    private void OpenActivity(==0)
    {
        if (1 == 1)
        {
            istart = new Intent(this, VIEW.class);
            startActivity(istart);
        }
        if (1 == 2)
        {
            finish();
            System.exit(0);
        }
    }
}