package com.example.megatask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sixth extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixth);
        b1=(Button) findViewById(R.id.button13);
        b2=(Button) findViewById(R.id.button14);
        b3=(Button) findViewById(R.id.button15);
        b5=(Button) findViewById(R.id.button17);
        b6=(Button) findViewById(R.id.button18);
        b7=(Button) findViewById(R.id.button19);
        b8=(Button) findViewById(R.id.button20);
        b9=(Button) findViewById(R.id.button21);
        b11=(Button) findViewById(R.id.button23);
        b12=(Button) findViewById(R.id.button24);
        b13=(Button) findViewById(R.id.button27);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Sixth.this, Music.class);
                startActivity(i1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Sixth.this, Torch.class);
                startActivity(i2);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3= new Intent(Sixth.this, Wifi.class);
                startActivity(i3);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5= new Intent(Sixth.this, Calculator.class);
                startActivity(i5);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6= new Intent(Sixth.this, Camera.class);
                startActivity(i6);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7= new Intent(Sixth.this, VideoRecorder.class);
                startActivity(i7);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8= new Intent(Sixth.this, Call.class);
                startActivity(i8);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9= new Intent(Sixth.this, SMS.class);
                startActivity(i9);
                finish();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11= new Intent(Sixth.this, Vibration.class);
                startActivity(i11);
                finish();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12= new Intent(Sixth.this, Webbrowser.class);
                startActivity(i12);
                finish();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13= new Intent(Sixth.this, Logout.class);
                startActivity(i13);
                finish();
            }
        });


    }
}