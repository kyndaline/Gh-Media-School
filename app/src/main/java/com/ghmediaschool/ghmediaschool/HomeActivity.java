package com.ghmediaschool.ghmediaschool;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button btn = (Button) findViewById(R.id.ghportalbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Login.class);
                startActivity(i);
            }
        });

        Button btn1 = (Button) findViewById(R.id.ghonlinebutton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, website.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.ghradiobutton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Radio.class);
                startActivity(i);
            }

        });

    }

    boolean twice;
    @Override
    public void onBackPressed() {
            if(twice == true) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
                System.exit(0);
            }
            // super.onBackPressed();
            Toast.makeText(HomeActivity.this, "press back again to exit", Toast.LENGTH_SHORT) .show();
            new Handler() .postDelayed(new Runnable() {
                @Override
                public void run() {
                    twice = false;
                }
            }, 3000);
            twice = true;

    }



}





