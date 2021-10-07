package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numDec1 = findViewById<TextView>(R.id.editTextNumberDecimal)
        val numDec2 = findViewById<TextView>(R.id.editTextNumberDecimal2)
        val numDec3 = findViewById<TextView>(R.id.editTextNumberDecimal3)
        val button = findViewById<Button>(R.id.button)
        val result1 = findViewById<TextView>(R.id.textView)
        val result2 = findViewById<TextView>(R.id.textView2)


    }
}