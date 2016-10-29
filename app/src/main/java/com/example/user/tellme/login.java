package com.example.user.tellme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
Button login;
Button member;
    Button forget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button) findViewById(R.id.s);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(login.this, homepage.class);
                startActivity(i);


            }
        });


        member=(Button) findViewById(R.id.setm);
        forget=(Button) findViewById(R.id.f);

        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(login.this, createacount.class);
                startActivity(j);


            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(login.this, forgetpassword.class);
                startActivity(j);


            }
        });


        getSupportActionBar().hide();
    }
}
