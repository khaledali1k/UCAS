package com.example.ucas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private RadioButton rememberRadioButton;
    private Button loginButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        emailEditText = findViewById(R.id.inpotEmill);
        passwordEditText = findViewById(R.id.inpotPasswor);
        rememberRadioButton = findViewById(R.id.roo);
        loginButton = findViewById(R.id.buttonSignIn);

          TextView oo=findViewById(R.id.createnewaccount);
          oo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  startActivity(new Intent(MainActivity.this, UCAS2.class));
              }
          });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,UCAS4.class);
                startActivity(intent);
                boolean passwordValid = true;
                boolean emailValid = true;

                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                boolean remember = rememberRadioButton.isChecked();

                // Perform login validation here
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Login successful, proceed to next activity or perform necessary actions
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                }


                if (password.length() == 0) {
                    passwordEditText.setError("Empty password");
                    passwordValid = false;
                }
                boolean lsterr = false;
                boolean number = false;

                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);
                    if (Character.isLetter(c)) {
                        lsterr = true;
                    } else if (Character.isDigit(c)) {
                        number = true;
                    }
                }

                if (lsterr && number) {
                } else {
                    passwordEditText.setError("The text must contain letters and numbers");
                    passwordValid = false;

                }


                if (email.length() == 0) {
                    emailEditText.setError("Empty Email");
                    emailValid = false;
                } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError("Invalid Email");
                    emailValid = false;
                }
               Intent intent1= new Intent(MainActivity.this, UCAS2.class);
                intent1.putExtra("name",email);
                startActivity(intent1);

            }



        });

        }

}
