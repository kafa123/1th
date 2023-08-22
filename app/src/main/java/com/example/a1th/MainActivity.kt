package com.example.a1th

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1th.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}