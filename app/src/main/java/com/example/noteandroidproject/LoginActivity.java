package com.example.noteandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username_lable);
        password = findViewById(R.id.password_lable);
        login = findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernametext = username.getText().toString();
                String passwordtext = username.getText().toString();
                if ("shehab".equals(usernametext) && "shehab".equals(passwordtext)) {
                    OpenHomeActivity();
                } else {
                    Toast.makeText(LoginActivity.this, "invlaid username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void OpenHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
