package com.example.megatask;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Call extends AppCompatActivity {
    EditText e1;
    Button b1, b2;
    private ActivityResultLauncher<String> requestPermissionLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call);
        e1 = findViewById(R.id.editTextText7);
        b1 = findViewById(R.id.button44);
        b2 = findViewById(R.id.button45);

        // Register permission request launcher
        requestPermissionLauncher = registerForActivityResult(
                new ActivityResultContracts.RequestPermission(),
                isGranted -> {
                    if (isGranted) {
                        makePhoneCall();
                    } else {
                        Toast.makeText(this, "Call Permission Denied!", Toast.LENGTH_SHORT).show();
                    }
                });

        // Call Button Click
        b1.setOnClickListener(view -> {
            if (ContextCompat.checkSelfPermission(Call.this, Manifest.permission.CALL_PHONE)
                    == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall();
            } else {
                requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE);
            }
        });

        // Back Button Click (Agar previous activity pe wapas jaana ho)
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Call.this, Sixth.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void makePhoneCall() {
        String pn = e1.getText().toString().trim();

        if (!pn.isEmpty()) {
            Intent p = new Intent(Intent.ACTION_CALL);
            p.setData(Uri.parse("tel:" + pn));

            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                    == PackageManager.PERMISSION_GRANTED) {
                startActivity(p);
            } else {
                Toast.makeText(this, "Permission Not Granted!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Please Enter a Phone Number", Toast.LENGTH_SHORT).show();
        }
    }
}