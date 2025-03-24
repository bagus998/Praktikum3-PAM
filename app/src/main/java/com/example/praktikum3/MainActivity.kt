package com.example.praktikum3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btn_login)
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)

        btnLogin.setOnClickListener(View.OnClickListener{
            val email = etEmail.getText().toString()
            val password = etPassword.getText().toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this@MainActivity,
                    "Email dan Password tidak boleh kosong",
                    Toast.LENGTH_SHORT).show()
            } else if (email == "BagusSetiawan@gmail.com" && password == "235150707111057"){
                Toast.makeText(this@MainActivity, "Berhasil LogIn", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, mr_head:: class.java))

            } else {
                Toast.makeText(this@MainActivity, "Email atau Password salah", Toast.LENGTH_SHORT).show()
            }
        })

        }
    }

