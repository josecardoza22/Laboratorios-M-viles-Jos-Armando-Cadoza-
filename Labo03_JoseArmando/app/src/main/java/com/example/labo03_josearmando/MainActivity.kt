package com.example.labo03_josearmando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var saldoMessage = findViewById<TextView>(R.id.saldo)
        val fiveCents = findViewById<ImageView>(R.id.fiveCent)
        val tenCents = findViewById<ImageView>(R.id.tenCent)
        val quarterCents = findViewById<ImageView>(R.id.quarterDollar)
        val oneDollar = findViewById<ImageView>(R.id.dollar)

        fiveCents.setOnClickListener{
            var result = saldoMessage.text.toString().toDouble()
            var resultado = (((result + 0.05)*100.0).roundToInt())/100.0
            saldoMessage.text = resultado.toString()
        }

        tenCents.setOnClickListener{
            var result = saldoMessage.text.toString().toDouble()
            var resultado = (((result + 0.10)*100.0).roundToInt())/100.0
            saldoMessage.text = resultado.toString()
        }

        quarterCents.setOnClickListener{
            var result = saldoMessage.text.toString().toDouble()
            var resultado = (((result + 0.25)*100.0).roundToInt())/100.0
            saldoMessage.text = resultado.toString()
        }

        oneDollar.setOnClickListener{
            var result = saldoMessage.text.toString().toDouble()
            var resultado = (((result + 1.00)*100.0).roundToInt())/100.0
            saldoMessage.text = resultado.toString()
        }
    }
}