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
        var count1 = 0
        var count2 = 0


        button.setOnClickListener {
            val num = textNum.text.toString().toInt()

            if (num > 10 || num < 0 ){
                if (count1 == 0 && count2 == 0)
                    result1.text ="No marks registered"
                else{
                    result1.text = "$count1 marks with more than 7 or 7.\n" +
                            "$count2 marks with less than 7."
                    button.isVisible = false
                }
            }else{
                if (num >= 7)
                    count1++
                else
                    count2++
            }
        }
    }
}
