package com.example.myhomwork;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EnActivity extends AppCompatActivity {


    String phone;
    String password;
    EditText editPhone;
    EditText editPassword;
    ImageButton backEn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en);


        final EditText editPhone=(EditText)findViewById(R.id.edit_phoneNum);
        final EditText editPassword=(EditText)findViewById(R.id.edit_password);
        Button btnOkEn=(Button)findViewById(R.id.btn_ok_en);
        ImageButton btnBackEn=(ImageButton)findViewById(R.id.btn_back_en);
        backEn=(ImageButton)findViewById(R.id.btn_back_en) ;
        backEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

       btnOkEn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               phone=editPhone.getText().toString();
               password=editPassword.getText().toString();
               SharedPreferences.Editor editor=getSharedPreferences("date",MODE_PRIVATE).edit();
               editor.putString("phoneNumber",phone);
               editor.putString("password",password);
               editor.apply();
               Intent intent2=new Intent(EnActivity.this,LoActivity.class);
               startActivity(intent2);
           }
       });

    }

}
