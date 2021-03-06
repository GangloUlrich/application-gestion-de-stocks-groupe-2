package com.example.gstocks.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gstocks.R;

public class LoginActivity extends AppCompatActivity {
    private Button connexionLoginPage;
    private Button inscriptionLoginPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        connexionLoginPage=findViewById(R.id.connexionLoginPage);
        inscriptionLoginPage=findViewById(R.id.inscriptionLoginPage);
        connexionLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        inscriptionLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this,InscriptionActivity.class);
                startActivity(intent);
            }
        });
    }
}