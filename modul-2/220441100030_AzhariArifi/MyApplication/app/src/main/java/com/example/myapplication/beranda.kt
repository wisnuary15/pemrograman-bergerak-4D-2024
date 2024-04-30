package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class beranda : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda)
    val imageButton = findViewById<ImageButton>(R.id.dua)
        imageButton.setOnClickListener{
            val intent = Intent (this,content::class.java)
            startActivity(intent)
        }
    }
}