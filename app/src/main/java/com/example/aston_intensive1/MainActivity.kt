package com.example.aston_intensive1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToSecondScreen = findViewById<Button>(R.id.btn_next_screen)
        val intent = Intent(this, SecondActivity::class.java)

        btnToSecondScreen.setOnClickListener {
            startActivity(intent)
        }
    }
}