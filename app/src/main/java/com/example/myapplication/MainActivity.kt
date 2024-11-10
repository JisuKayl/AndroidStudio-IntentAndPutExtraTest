package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.buttonLogin)
        val signup = findViewById<TextView>(R.id.signUpText)
        val changepass= findViewById<TextView>(R.id.changePass)

        login.setOnClickListener {
            val userStr = "username"
            val passStr = "pass123"

            if(username.text.toString() == userStr && password.text.toString() == passStr){
                val dashboardpage = Intent(this, Form::class.java);
                startActivity(dashboardpage)
            }
            else{
                Toast.makeText(this, "Username or Password is incorrect.", Toast.LENGTH_SHORT).show();
            }

            signup.setOnClickListener {
                val signupage = Intent(this, SignUp::class.java);
                startActivity(signupage)
            }

            changepass.setOnClickListener {
                val changepasspage = Intent(this, Password::class.java);
                startActivity(changepasspage)
            }
        }
    }
}