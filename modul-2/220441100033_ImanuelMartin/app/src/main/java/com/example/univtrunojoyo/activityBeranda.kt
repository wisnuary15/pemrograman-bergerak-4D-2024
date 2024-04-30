package com.example.univtrunojoyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent


class activityBeranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
    }
    fun profil(view: View) {
        val intent = Intent(this, profil()::class.java)
        startActivity(intent)
    }
}