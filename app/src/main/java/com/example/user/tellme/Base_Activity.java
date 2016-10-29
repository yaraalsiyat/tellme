package com.example.user.tellme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by user on 10/15/16.
 */

public class Base_Activity  extends AppCompatActivity
{
    Menu menu;
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.menu = menu;


        getSupportActionBar().setElevation(1);


        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.home:
                Intent intent = new Intent(this, homepage.class);

                this.startActivity(intent);
                break;

            case R.id.list:


             //   Intent intentl = new Intent(this, MapsActivity.class);
              //  this.startActivity(intentl);
                break;

            case R.id.location:

              //  Intent intentr = new Intent(this, broadcastmsg.class);
               // this.startActivity(intentr);
                break;

            case R.id.messages:

               // Intent intentm = new Intent(this, messages.class);
               // this.startActivity(intentm);
                break;

            case R.id.profile:

               // Intent intentp = new Intent(this, profile.class);
              //  this.startActivity(intentp);
                break;

            case R.id.action_settings:

              //  Intent intents = new Intent(this, settings.class);
                //this.startActivity(intents);
                break;


            default:
                return super.onOptionsItemSelected(item);}

        return true;
    }




}
