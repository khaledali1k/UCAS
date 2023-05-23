package com.example.ucas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UCAS6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucas6);
        EditText ioi=findViewById(R.id.inpotk);
        Button oio=findViewById(R.id.buttonSignIn);
        oio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ui =ioi.getText().toString();
                ui.trim();

                Intent intent=new Intent(UCAS6.this,UCAS4.class);
                intent.putExtra("Name",ui);
                startActivity(intent);
            }
        });
    }
}