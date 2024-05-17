package com.example.modultiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.modultiga.R.id.buttonMasuk
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

private lateinit var usernameInput: TextInputEditText
private lateinit var passwordInput: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_edit)
        passwordInput = findViewById(R.id.password_edit)

        val loginBTN =findViewById<MaterialButton>(buttonMasuk)

        loginBTN.setOnClickListener{

            if(validasiInput()){
                val intent = Intent(this, BerandaActivity::class.java)

                intent.putExtra("Nama", usernameInput.text.toString())

                startActivity(intent)
            }else{
                Toast.makeText(this, "Tolong Masukkan Inputan Dengan Benar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validasiInput() : Boolean{
        if(usernameInput.text.toString().isEmpty()){
            usernameInput.error = "Tolong Masukkan Username Kamu!"
            return false
        }

        if(passwordInput.text.toString().isEmpty()){
            passwordInput.error = "Tolong Masukkan Password Kamu!"
            return false
        }

        return true
    }
}