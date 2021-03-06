package com.example.gstocks.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gstocks.R;

public class InscriptionActivity extends AppCompatActivity {
    private Button signupButton;
    private TextView goBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        signupButton=findViewById(R.id.signupButton);
        goBackLogin=findViewById(R.id.goBacKLogin);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscriptionActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        goBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscriptionActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}