package com.example.videoplayerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videoplayerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for the buttons
        // to navigate to the different Views/Pages
        binding.btnVideo1.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video1Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo2.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video2Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo3.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video3Activity::class.java)
            startActivity(intent)
            }

        binding.btnVideo4.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video4Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo5.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video5Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo6.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video6Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo7.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video7Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo8.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video8Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo9.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video9Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo10.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video10Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo11.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video11Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo12.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video12Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo13.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video13Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo14.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video14Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo15.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video15Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo16.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video16Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo17.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video17Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo18.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video18Activity::class.java)
            startActivity(intent)
        }

        binding.btnVideo19.setOnClickListener {
            val intent = Intent(this, com.example.videoplayerapp.Video19Activity::class.java)
            startActivity(intent)
        }
        }
    }


