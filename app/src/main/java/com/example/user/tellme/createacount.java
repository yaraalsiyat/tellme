package com.example.user.tellme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createacount extends AppCompatActivity {
Button join;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createacount);


        join =(Button) findViewById(R.id.s);

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(createacount.this, homepage.class);
                startActivity(i);


            }
        }
        );





           }}




   //     getSupportActionBar().hide();
  //  }

