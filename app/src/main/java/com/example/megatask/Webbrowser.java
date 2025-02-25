package com.example.megatask;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Webbrowser extends AppCompatActivity {
    WebView w1;
    Button b1, b2;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_webbrowser);
        e1 = findViewById(R.id.editTextText13);
        b1 = findViewById(R.id.button57);
        b2 = findViewById(R.id.button59);
        w1 = findViewById(R.id.webview);

        // WebView settings
        WebSettings webSettings = w1.getSettings();
        ((WebSettings) webSettings).setJavaScriptEnabled(true); // Enable JavaScript
        w1.setWebViewClient(new WebViewClient()); // Open links inside WebView

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String weburl = e1.getText().toString().trim();

                // Validate URL
                if (!weburl.isEmpty()) {
                    if (!weburl.startsWith("http://") && !weburl.startsWith("https://")) {
                        weburl = "https://" + weburl; // Auto-add https:// if missing
                    }
                    w1.loadUrl(weburl);
                } else {
                    Toast.makeText(Webbrowser.this, "enter valid url", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Webbrowser.this, Sixth.class);
                startActivity(i);
                finish();
            }
        });
    }
}