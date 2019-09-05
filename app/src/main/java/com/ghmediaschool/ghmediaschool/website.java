package com.ghmediaschool.ghmediaschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);


        Button btn = (Button) findViewById(R.id.button_mediasch);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view)
            {
                Intent i = new Intent(website.this,Media.class);
                startActivity(i);
            }
        });


        Button btn1 = (Button) findViewById(R.id.button_cosmetology);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view)
            {
                Intent i = new Intent(website.this,Cosmetology.class);
                startActivity(i);
            }
        });


        Button btn2 = (Button) findViewById(R.id.button_gh);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view)
            {
                Intent i = new Intent(website.this,GHOnline.class);
                startActivity(i);
            }
        });



    }
}
