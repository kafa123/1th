package com.example.a1th

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a1th.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnTest.setOnClickListener {
                val enteredText = nameTextView.text.toString()
                Toast.makeText(this@MainActivity, enteredText, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
