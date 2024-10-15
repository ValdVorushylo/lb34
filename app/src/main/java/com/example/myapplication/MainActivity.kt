package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewName.setOnClickListener {
            binding.textViewName.setTextColor(Color.RED)
        }
        binding.textViewGroup.setOnClickListener {
            binding.textViewGroup.setTextColor(Color.GREEN)
        }
        binding.textViewCity.setOnClickListener {
            binding.textViewCity.setTextColor(Color.BLUE)
        }
        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = View.GONE
        }
        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = View.VISIBLE
        }
    }
}