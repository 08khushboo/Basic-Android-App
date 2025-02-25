package com.example.megatask;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Torch extends AppCompatActivity {
    Button b1,b2,b3;
    CameraManager cm;
    private boolean torch=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_torch);
        b1=(Button) findViewById(R.id.button30);
        b2=(Button) findViewById(R.id.button31);
        b3=(Button) findViewById(R.id.button32);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                    {
                        String id=cm.getCameraIdList()[0];
                        cm.setTorchMode(id,true);
                        torch=true;
                    }
                    catch(CameraAccessException e)
                    {

                    }
                }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                    {
                        String id=cm.getCameraIdList()[0];
                        cm.setTorchMode(id,false);
                        torch=false;
                    }
                    catch(CameraAccessException e)
                    {

                    }
                }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Torch.this, Sixth.class);
                startActivity(i1);
                finish();
            }
        });
    }
}