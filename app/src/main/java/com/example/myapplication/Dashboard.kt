package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val nameRs = findViewById<TextView>(R.id.name_rs)
        val courseRs = findViewById<TextView>(R.id.course_rs)
        val ageRs = findViewById<TextView>(R.id.age_rs)
        val contactRs = findViewById<TextView>(R.id.contact_rs)

        val bundle1:Bundle? = intent.extras
        val rsName = bundle1!!.getString("name_key")
        nameRs.text = rsName

        val bundle2:Bundle? = intent.extras
        val rsCourse = bundle2!!.getString("course_key")
        courseRs.text = rsCourse

        val bundle3:Bundle? = intent.extras
        val rsAge = bundle3!!.getString("age_key")
        ageRs.text = rsAge

        val bundle4:Bundle? = intent.extras
        val rsContact = bundle4!!.getString("contact_key")
        contactRs.text = rsContact
    }
}