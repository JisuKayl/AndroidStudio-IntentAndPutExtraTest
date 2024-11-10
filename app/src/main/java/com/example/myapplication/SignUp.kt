package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val changePass = findViewById<Button>(R.id.buttonSignUp);
        val loginText = findViewById<TextView>(R.id.loginText);

        changePass.setOnClickListener {
            val loginpage = Intent(this, MainActivity::class.java);
            startActivity(loginpage);
        }

        loginText.setOnClickListener {
            val loginpage = Intent(this, MainActivity::class.java);
            startActivity(loginpage);
        }
    }
}