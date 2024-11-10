package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val submit = findViewById<Button>(R.id.submit_btn)
        val name = findViewById<EditText>(R.id.name_et)
        val course = findViewById<EditText>(R.id.course_et)
        val age = findViewById<EditText>(R.id.age_et)
        val contact = findViewById<EditText>(R.id.contact_et)

        submit.setOnClickListener {
            val nameStr :String = name.text.toString()
            val courseStr :String = course.text.toString()
            val ageStr :String = age.text.toString()
            val contactStr :String = contact.text.toString()

            val intent = Intent(this, Dashboard::class.java)

            intent.putExtra("name_key", nameStr)
            intent.putExtra("course_key", courseStr)
            intent.putExtra("age_key", ageStr)
            intent.putExtra("contact_key", contactStr)
            startActivity(intent)
        }
    }
}