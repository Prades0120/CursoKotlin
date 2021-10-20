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
        val result1 = findViewById<TextView>(R.id.textView)
        var quan1 = 0
        var quan2 = 0
        var quan3 = 0
        var total = 0

        button.text = "Introduce"
        textNum.hint = "Still blank or 0 to finish"

        button.setOnClickListener {
            var num = 0.0
            try {
                num = textNum.text.toString().toDouble()
            }catch (e: Exception){
            }

            if (num != 0.0 ) {
                when {
                    num > 10.2 -> quan3++
                    num >= 9.8 -> quan1++
                    else -> quan2++
                }
                total++
                result1.text = "Fit pieces: $quan1\n" +
                        "Low weight pieces: $quan2\n" +
                        "High weight pieces: $quan3\n" +
                        "Total of pieces: $total"
            }else{
                if (total == 0){
                    result1.text = "ERROR...\nNOT WEIGHTS INTRODUCED"
                }else {
                    button.isVisible = false
                    textNum.isVisible = false
                    result1.text = "FINAL RESULT:\n\n" +
                            "Fit pieces: $quan1\n" +
                            "Low weight pieces: $quan2\n" +
                            "High weight pieces: $quan3\n" +
                            "Total of pieces: $total"
                }
            }
            textNum.text = ""
        }
    }
}
