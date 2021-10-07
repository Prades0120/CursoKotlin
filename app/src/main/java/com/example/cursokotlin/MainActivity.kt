package com.example.cursokotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNum = findViewById<TextView>(R.id.editTextNumberDecimal)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val result1 = findViewById<TextView>(R.id.textView)
        val result2 = findViewById<TextView>(R.id.textView2)
        var numerOfPieces = 0
        var amount = 0
        val numbers = ArrayList<Float>(0)

        button.isVisible = false


        button.setOnClickListener{
            val num = textNum.text.toString().toFloat()
            if (numerOfPieces == 0){
                result1.text = "ERROR"
            }else if(numbers.size == numerOfPieces) {
                for (i in 0 until numbers.size) {
                    if (numbers[i] in 1.2..1.3)
                        amount++
                    result1.text = "The number of the suitable parts are: $amount"
                }
            }else{
                numbers.add(num)
                if (numbers.size == numerOfPieces) {
                    button.text = "Calculate"
                    result2.text = ""
                }
                else {
                    button.text = "Length ${numbers.size + 1}"
                    result2.text = "${numerOfPieces-numbers.size} remaining"
                }
            }
        }

        button2.setOnClickListener {
            numerOfPieces = textNum.text.toString().toInt()
            if (textNum.text == null || textNum.text == "")
                result1.text = "Introduce a number"
            else if (numerOfPieces == 0){
                result1.text = "You must introduce at least one"
            }else{
                result2.text = "$numerOfPieces remaining"
                button.text = "Length 1"
                button2.isVisible = false
                button.isVisible = true
            }
        }
    }
}