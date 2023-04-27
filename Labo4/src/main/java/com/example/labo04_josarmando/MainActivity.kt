package com.example.labo04_josarmando

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.sendData)
        var name = findViewById<EditText>(R.id.name)
        var email = findViewById<EditText>(R.id.email)
        var phone = findViewById<EditText>(R.id.phone)

        var nameSend = name.text.toString()
        var emailSend = email.text.toString()
        var phoneSend = phone.text.toString()

        button.setOnClickListener{
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("sendName", nameSend)
            intent.putExtra("sendEmail", emailSend)
            intent.putExtra("sendPhone", phoneSend)
            startActivity(intent)
        }
    }
}

