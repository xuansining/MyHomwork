package com.example.myhomwork;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private SharedPreferences preferences;
    private  SharedPreferences.Editor editor;
    private EditText accountEdit;
    private  EditText passwordEdit;
    private Button login;
    private ImageButton backLo;
    private CheckBox rememberPass;
    String account;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo);
        pref=PreferenceManager.getDefaultSharedPreferences(this);
        accountEdit=(EditText)findViewById(R.id.accountEdit);
        passwordEdit=(EditText)findViewById(R.id.passwordEdit);
        login=(Button)findViewById(R.id.Login);
        backLo=(ImageButton) findViewById(R.id.btn_back_lo);
        rememberPass=(CheckBox)findViewById(R.id.remember_pass);
        preferences=getSharedPreferences("date",MODE_PRIVATE);
        final String phone_num=preferences.getString("phoneNumber","");
        final String phone_password=preferences.getString("password","");
        backLo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        boolean isRemember=pref.getBoolean("remember_password",false);
        if (isRemember){
            String account=accountEdit.getText().toString();
            String password=passwordEdit.getText().toString();
             account=pref.getString("account","");
             password=pref.getString("password","");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rememberPass.setChecked(true);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 account=accountEdit.getText().toString();
                 password=passwordEdit.getText().toString();


                if (account.equals(phone_num)&&password.equals(phone_password)){
                    editor=pref.edit();
                    if (rememberPass.isChecked()){
                        editor.putBoolean("remember_password",true);
                        editor.putString("account",account);
                        editor.putString("password",password);
                    }else{
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent3=new Intent(  LoActivity.this,MusicActivity.class);
                    startActivity(intent3);
                    finish();
                }else{
                    Toast.makeText(LoActivity.this, "密码或账号错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
