package com.example.tugasmodul2


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnClick: ImageView = findViewById(R.id.imgKembali)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v != null ){
            when(v.id){
                R.id.imgKembali -> {
                    val lanjut = Intent(this,MainActivity3::class.java)
                    startActivity(lanjut)
                }
            }
        }

    }
}