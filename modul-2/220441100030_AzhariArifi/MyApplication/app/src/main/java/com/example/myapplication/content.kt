package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class content : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content)
        val imageButton = findViewById<ImageButton>(R.id.tiga)
        imageButton.setOnClickListener{
            val intent = Intent (this,profile::class.java)
            startActivity(intent)
        }
    }
}