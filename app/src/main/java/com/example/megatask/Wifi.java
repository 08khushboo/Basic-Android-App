package com.example.megatask;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Wifi extends AppCompatActivity {
    Button b1,b2,b3;
    WifiManager wm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_wifi);
        b1=(Button) findViewById(R.id.button33);
        b2=(Button) findViewById(R.id.button34);
        b3=(Button) findViewById(R.id.button35);
        wm=(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
                    Intent panelIntent=new Intent(Settings.Panel.ACTION_WIFI);
                    startActivityForResult(panelIntent,0);
                }
                else{
                    wm.setWifiEnabled(true);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wm.setWifiEnabled(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Wifi.this, Sixth.class);
                startActivity(i2);
                finish();
            }
        });
    }
}