package com.example.aston_intensive1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second_screen) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val btnBack = findViewById<Button>(R.id.btn_curr_screen)
        val intentSecondScreen = Intent(this, MainActivity::class.java)

        btnBack.setOnClickListener {
            startActivity(intentSecondScreen)
        }
    }
}