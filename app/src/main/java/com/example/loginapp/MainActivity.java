package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity  {
    Button btn1,btn2;
    EditText edt1,edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        btn1 = (Button)findViewById(R.id.blogin);
        edt1 = (EditText)findViewById(R.id.email);
        edt2 = (EditText)findViewById(R.id.password);
        btn2 = (Button)findViewById(R.id.bregister);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().toString().equals("edt1 = (admin@admin.com") && edt2.getText().toString().equals("admin"))

                {
                    Toast.makeText(MainActivity.this, "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (".welcome");
                    startActivity(intent);

                }
                else
                    {
                    Toast.makeText(MainActivity.this, "invalid email or password, register first",Toast.LENGTH_SHORT).show();


                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".register");
                startActivity(intent);
            }
        });

    }

}
