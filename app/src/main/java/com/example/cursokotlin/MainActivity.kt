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

        textNum.isVisible = false
        button.text = "100"


        button.setOnClickListener {
            var text = "Numbers: \n"
            for (i in 1..100){
                text += when {
                    i == 100 -> "$i."
                    i%10 != 0 -> "$i, "
                    else -> "$i,\n"
                }
            }
            result1.text = text
        }
    }
}
