package com.example.labo02_josarmando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btnCalculate)
        var inputWeight = findViewById<EditText>(R.id.inputWeight)
        var inputHeight = findViewById<EditText>(R.id.inputHeight)
        var resultMessage = findViewById<TextView>(R.id.resultBMI)
        var classMessage = findViewById<TextView>(R.id.weightClass)
        var valueMessage = findViewById<TextView>(R.id.valueBMI)

        button.setOnClickListener{
            val weight = inputWeight.text.toString().toDouble()
            val height =  inputWeight.text.toString().toDouble()

            val result = weight/(height*height)
            if (result > 18.50) {
                resultMessage.text = "${result.toString()}"
                classMessage.text = "Underweight"
                valueMessage.text = "Underweight range is less tan 18.5"
            } else if (18.50 < result && result < 24.99) {
                resultMessage.text = "${result.toString()}"
                classMessage.text = "Healty"
                valueMessage.text = "Healty range is 18.5-24.9"
            } else if (25.00 < result && result < 29.99) {
                resultMessage.text = "${result.toString()}"
                classMessage.text = "Overweight"
                valueMessage.text = "Overweight range is 25-29.9"
            } else if (result > 30) {
                resultMessage.text = "${result.toString()}"
                classMessage.text = "Obess"
                valueMessage.text = "Obess range is more tan 30"
            }
        }
    }
}