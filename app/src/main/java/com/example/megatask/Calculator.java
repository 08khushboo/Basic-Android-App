package com.example.megatask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculator extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    EditText e1,e2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);
        b1=(Button) findViewById(R.id.button39);
        b2=(Button) findViewById(R.id.button40);
        b3=(Button) findViewById(R.id.button41);
        b4=(Button) findViewById(R.id.button42);
        b5=(Button) findViewById(R.id.button43);
        e1=(EditText) findViewById(R.id.editTextText15);
        e2=(EditText) findViewById(R.id.editTextText16);
        t1=(TextView) findViewById(R.id.textView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1+f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "s3", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1-f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "s3", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1*f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "s3", Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                float f1=Float.parseFloat(s1);
                float f2=Float.parseFloat(s2);
                float f3=f1/f2;
                String s3= Float.toString(f3);
                t1.setText(s3);
                Toast.makeText(Calculator.this, "s3", Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Calculator.this, Sixth.class);
                startActivity(i1);
                finish();
            }
        });
    }
}