package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUserName, txtPassword, txtConfirmPassword;
    Button submitBtn;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = findViewById(R.id.txtUserName);
        txtPassword = findViewById(R.id.txtPassword);
        txtConfirmPassword = findViewById(R.id.txtConfirmPassword);
        submitBtn = findViewById(R.id.submitBtn);
        tvOutput = findViewById(R.id.tvOutput);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name = txtUserName.getText().toString();
                final String password = txtPassword.getText().toString();
                final String confirmPassword = txtConfirmPassword.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter username", Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
                }
                else if (confirmPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter confirm password", Toast.LENGTH_SHORT).show();
                }
                else if (!password.equals(confirmPassword)) {
                    Toast.makeText(MainActivity.this, "Please enter correct password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You are login", Toast.LENGTH_SHORT).show();

                    //show data
                    tvOutput.setText("Name: " +name+"\nPassword: "+password);
                }
            }
        });

    }
}
