package com.example.labo04_josarmando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var reName = intent.getStringExtra("sendName").toString()
        var reEmail = intent.getStringExtra("sendEmail").toString()
        var rePhone = intent.getStringExtra("sendPhone").toString()

        var editName = findViewById<TextView>(R.id.editName)
        var editEmail = findViewById<TextView>(R.id.editEmail)
        var editPhone = findViewById<TextView>(R.id.editPhone)

        editName.text = reName
        editEmail.text = reEmail
        editPhone.text = rePhone
    }
}