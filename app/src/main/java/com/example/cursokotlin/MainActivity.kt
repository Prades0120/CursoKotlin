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
        var total = 0
        var account = -1

        button.text = "Introduce"
        textNum.hint = "Introduce a negative account to finish"


        button.setOnClickListener {
            var num = -1
            try {
                num = textNum.text.toString().toInt()
            }catch (e: Exception){
            }

            if (account >= 0 ) {
                textNum.hint = "Introduce an account"
                if (num > 0 ){
                    result1.text = "Credit balance"
                    total+=num
                }else if (num == 0 )
                    result1.text = "Null balance"
                else
                    result1.text = "Debit balance"

                account = -1
            }else if (account<0 && num<0){
                button.isVisible = false
                textNum.isVisible = false
                result1.text = "Total of balanced credits: $total"
            }else{
                textNum.hint = "Introduce a balance value"
                account = num
                result1.text = ""
            }
            textNum.text = ""
        }
    }
}
