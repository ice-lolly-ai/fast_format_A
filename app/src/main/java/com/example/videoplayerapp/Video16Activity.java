package com.example.videoplayerapp;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Video16Activity extends AppCompatActivity {

    private Button btnVideo1;
    private VideoView videoView1, videoView2, videoView3, videoView4,videoView5, videoView6, videoView7, videoView8, videoView9, videoView10,videoView11;

    private static final int screenWidth = 1080; // Replace with actual screen width
    private static final int screenHeight = 1920; // Replace with actual screen height

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video16);

        // Initialize buttons
        btnVideo1 = findViewById(R.id.btnVideo1);
//        btnVideo3 = findViewById(R.id.btnVideo3);

        // Set click listeners for navigation buttons
        btnVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Video16Activity.this, MainActivity.class));
                finish();
            }
        });

//        btnVideo3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Video2Activity.this, Video3Activity.class));
//                finish();
//            }
//        });

        // Initialize VideoViews
        videoView1 = findViewById(R.id.videoView1);
        videoView2 = findViewById(R.id.videoView2);
        videoView3 = findViewById(R.id.videoView3);
        videoView4 = findViewById(R.id.videoView4);
        videoView5 = findViewById(R.id.videoView5);
        videoView6 = findViewById(R.id.videoView6);
        videoView7 = findViewById(R.id.videoView7);
        videoView8 = findViewById(R.id.videoView8);
        videoView9 = findViewById(R.id.videoView9);
        videoView10 = findViewById(R.id.videoView10);
        videoView11 = findViewById(R.id.videoView11);


        // Set the paths for the videos
        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_3;
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_3;
        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_2;
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_1;
        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_3;
        String videoPath6 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_2;
        String videoPath7 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_1;
        String videoPath8 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_3;
        String videoPath9 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_2;
        String videoPath10 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_1;
        String videoPath11 = "android.resource://" + getPackageName() + "/" + R.raw.move_test_1;



        // Parse the URIs for the videos
        Uri uri1 = Uri.parse(videoPath1);
        Uri uri2 = Uri.parse(videoPath2);
        Uri uri3 = Uri.parse(videoPath3);
        Uri uri4 = Uri.parse(videoPath4);
        Uri uri5 = Uri.parse(videoPath5);
        Uri uri6 = Uri.parse(videoPath6);
        Uri uri7 = Uri.parse(videoPath7);
        Uri uri8 = Uri.parse(videoPath8);
        Uri uri9 = Uri.parse(videoPath9);
        Uri uri10 = Uri.parse(videoPath10);
        Uri uri11= Uri.parse(videoPath11);

        // Set the URIs to the VideoViews
        videoView1.setVideoURI(uri1);
        videoView2.setVideoURI(uri2);
        videoView3.setVideoURI(uri3);
        videoView4.setVideoURI(uri4);
        videoView5.setVideoURI(uri5);
        videoView6.setVideoURI(uri6);
        videoView7.setVideoURI(uri7);
        videoView8.setVideoURI(uri8);
        videoView9.setVideoURI(uri9);
        videoView10.setVideoURI(uri10);
        videoView11.setVideoURI(uri11);

        // Start playing the videos
        videoView1.start();
        videoView2.start();
        videoView3.start();
        videoView4.start();
        videoView5.start();
        videoView6.start();
        videoView7.start();
        videoView8.start();
        videoView9.start();
        videoView10.start();
        videoView11.start();

        // Set completion listeners to loop the videos
        videoView1.setOnCompletionListener(mp -> videoView1.start());
        videoView2.setOnCompletionListener(mp -> videoView2.start());
        videoView3.setOnCompletionListener(mp -> videoView3.start());
        videoView4.setOnCompletionListener(mp -> videoView4.start());
        videoView5.setOnCompletionListener(mp -> videoView5.start());
        videoView6.setOnCompletionListener(mp -> videoView6.start());
        videoView7.setOnCompletionListener(mp -> videoView7.start());
        videoView8.setOnCompletionListener(mp -> videoView8.start());
        videoView9.setOnCompletionListener(mp -> videoView9.start());
        videoView10.setOnCompletionListener(mp -> videoView10.start());
        videoView11.setOnCompletionListener(mp -> videoView11.start());

        // Start random bouncing animation for all VideoViews
        startRandomBouncingAnimation(videoView1);
        startRandomBouncingAnimation(videoView2);
        startRandomBouncingAnimation(videoView3);
        startRandomBouncingAnimation(videoView4);
        startRandomBouncingAnimation(videoView5);
        startRandomBouncingAnimation(videoView6);
        startRandomBouncingAnimation(videoView7);
        startRandomBouncingAnimation(videoView8);
        startRandomBouncingAnimation(videoView9);
        startRandomBouncingAnimation(videoView10);
        startRandomBouncingAnimation(videoView11);
    }

    private void startRandomBouncingAnimation(final View view) {
        Random random = new Random();

        // Generate random initial position
        int x = random.nextInt(screenWidth - view.getWidth());
        int y = random.nextInt(screenHeight - view.getHeight());

        // Random initial speed
        final int[] dx = {random.nextInt(2100) - 1000}; // Range from -10 to 10 inclusive
        final int[] dy = {random.nextInt(2100) - 1000}; // Range from -10 to 10 inclusive

        // Create ObjectAnimator for x and y translation
        ObjectAnimator bounceAnimatorX = ObjectAnimator.ofFloat(view, "translationX", x);
        bounceAnimatorX.setInterpolator(new AccelerateDecelerateInterpolator());
        bounceAnimatorX.setRepeatCount(ValueAnimator.INFINITE);
        bounceAnimatorX.setDuration(random.nextInt(2) + 1); // Random duration between 1000 to 3000 ms

        ObjectAnimator bounceAnimatorY = ObjectAnimator.ofFloat(view, "translationY", y);
        bounceAnimatorY.setInterpolator(new AccelerateDecelerateInterpolator());
        bounceAnimatorY.setRepeatCount(ValueAnimator.INFINITE);
        bounceAnimatorY.setDuration(random.nextInt(20) + 10); // Random duration between 1000 to 3000 ms

        // Start animation
        bounceAnimatorX.start();
        bounceAnimatorY.start();

        // Add listeners for bounce effect
        bounceAnimatorX.addUpdateListener(animation -> {
            // Reverse direction on hitting screen edge
            if (view.getX() <= 0 || view.getX() + view.getWidth() >= screenWidth) {
                dx[0] = -dx[0];
            }
            view.setTranslationX(view.getTranslationX() + dx[0]);
        });

        bounceAnimatorY.addUpdateListener(animation -> {
            // Reverse direction on hitting screen edge
            if (view.getY() <= 0 || view.getY() + view.getHeight() >= screenHeight) {
                dy[0] = -dy[0];
            }
            view.setTranslationY(view.getTranslationY() + dy[0]);
        });
    }
}
