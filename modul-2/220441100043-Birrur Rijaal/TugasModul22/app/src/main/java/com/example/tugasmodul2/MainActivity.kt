package com.example.tugasmodul2


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.btnLanjut)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v != null ){
            when(v.id){
                R.id.btnLanjut -> {
                    val lanjut = Intent(this,MainActivity2::class.java)
                    startActivity(lanjut)
                }
            }
            }

    }
}