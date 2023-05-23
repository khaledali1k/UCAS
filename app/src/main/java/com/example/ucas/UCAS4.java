package com.example.ucas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class UCAS4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucas4);
        RecyclerView i1i;
        TextView tuy=findViewById(R.id.eds);
        TextView tuy1=findViewById(R.id.ery);
        Button ii=  findViewById(R.id.yuy);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnDialog = findViewById(R.id.tttt);


        i1i=  findViewById(R.id.er1ii);
        Button u2u=findViewById(R.id.bot2);
        Button u1u=findViewById(R.id.oio);
        LinearLayout opo=findViewById(R.id.ere12);
        i1i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UCAS4.this, UCAS5.class));
            }
        });
        opo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UCAS4.this, UCAS3.class));
            }
        });
        u2u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UCAS4.this, UCAS6.class));
            }
        });
        u1u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UCAS4.this, UCAS7.class));
            }
        });

        ii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UCAS4.this, UCAS10.class));
            }
        });


                btnDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder dialog =new AlertDialog.Builder(UCAS4.this);
                        dialog.setTitle("هل انت متاكد من الحدف");
                        dialog.setMessage("");
                        dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

                        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                        dialog.show();
                    }
                });

       // String jj=getIntent().getStringExtra("Name");
        ArrayList<inpot1> data = new ArrayList<>();

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(i1i);
            }
        });


        inpot1 iii=new inpot1("EHDBC");
        data.add(iii);
        inpot1 ww=new inpot1("EHDBC");
        data.add(ww);
        inpot1 www=new inpot1("EHDBC");
        data.add(www);


        CustomRecycleAdapter adapter = new CustomRecycleAdapter(this,data);
       i1i.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        i1i.setLayoutManager(manager);
    }

}



