package com.example.amitsaxena.testapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        int age=i.getIntExtra("age",0);

        Toast.makeText(this, "Second Activity Opened", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Name : "+name, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Age : "+String.valueOf(age), Toast.LENGTH_SHORT).show();

    }
}
