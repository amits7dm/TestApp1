package com.example.amitsaxena.testapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button buttonNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "First Activity", Toast.LENGTH_LONG).show();

        buttonNewActivity=(Button)findViewById(R.id.button1);

        buttonNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("name","Amit");
                i.putExtra("age",35);
                startActivity(i);

            }
        });



    }
}
