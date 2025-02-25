package com.example.megatask;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VideoRecorder extends AppCompatActivity {
    Button b1,b2;
    VideoView vi;
    MediaController m1;
    Uri u1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_recorder);
        b1=(Button) findViewById(R.id.button54);
        b2=(Button) findViewById(R.id.button55);
        vi=(VideoView) findViewById(R.id.videoView);
        m1= new MediaController(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i,99);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(VideoRecorder.this, Sixth.class);
                startActivity(i2);
                finish();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==99)
        {
            u1=data.getData();
            vi.setMediaController(m1);
            m1.setAnchorView(vi);
            vi.setVideoURI(u1);
            vi.start();
        }
        else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }
    }
}