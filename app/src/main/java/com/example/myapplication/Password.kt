package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val changePass = findViewById<Button>(R.id.buttonSignUp);

        changePass.setOnClickListener {
            val loginpage = Intent(this, MainActivity::class.java);
            startActivity(loginpage);
        }
    }
}