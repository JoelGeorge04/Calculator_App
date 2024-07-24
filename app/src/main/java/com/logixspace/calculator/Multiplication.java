package com.logixspace.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Multiplication extends AppCompatActivity {
    AppCompatButton b1, b2;
    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);
        b1 = (AppCompatButton) findViewById(R.id.res);
        b2 = (AppCompatButton) findViewById(R.id.result);
        t1 = (EditText) findViewById(R.id.num1);
        t2 = (EditText) findViewById(R.id.num2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0;
                int b=0;
                String n1 = t1.getText().toString();
                String n2 = t2.getText().toString();
                 a = Integer.parseInt(n1);
                 b = Integer.parseInt(n2);
                int sum = a * b;
                String result = String.valueOf(sum);
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();

            }
        });
    }
}
