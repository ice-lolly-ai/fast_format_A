package com.example.videoplayerapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Video1Activity extends AppCompatActivity {

    private Button btnVideo1, btnVideo2, btnVideo3;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);

        // Initialize buttons
        btnVideo1 = findViewById(R.id.btnVideo1);
        btnVideo2 = findViewById(R.id.btnVideo2);
        btnVideo3 = findViewById(R.id.btnVideo3);

        // Set click listeners for navigation buttons
        btnVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Already in Video1Activity, so no action needed here
            }
        });

        btnVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Video1Activity.this, Video2Activity.class));
                finish(); // Optional, depending on your navigation needs
            }
        });

        btnVideo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Video1Activity.this, Video3Activity.class));
                finish(); // Optional, depending on your navigation needs
            }
        });
//
//        videoView = findViewById(R.id.videoView);
//
//        // Set the path of the video that you want to play
//        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_1;
//
//        // Parse the URI for the video
//        Uri uri = Uri.parse(videoPath);
//
//        // Set the URI to the videoView
//        videoView.setVideoURI(uri);
//
//        // Create a media controller
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//
//        // Set media controller to video view
//        videoView.setMediaController(mediaController);
//
//        // Start playing the video
//        videoView.start();
//
//        // Set a completion listener to loop the video
//        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                // Loop the video by seeking to the beginning
//                videoView.start();
//            }
//        });
    }
}
