package com.example.ucas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class UCAS8 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucas8);
        LinearLayout oo= findViewById(R.id.kk);
        Button io= findViewById(R.id.i1);
        io.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent=new Intent(UCAS8.this,UCAS9.class);
             startActivity(intent);
            }
        });
        oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UCAS8.this,UCAS9.class);
                startActivity(intent);
            }
        });
    }
}