package com.example.myhomwork;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonLog=(Button)findViewById(R.id.btn_log);
        Button buttonEn=(Button)findViewById(R.id.btn_en);
        final Intent intent=new Intent(getApplicationContext(),LoActivity.class);
        final Intent intent4=new Intent(getApplicationContext(),EnActivity.class);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
      buttonEn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(intent4);
          }
      });


    }
}
