package com.example.lab11

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.lab1)

        val input_text = findViewById<TextInputEditText>(R.id.input_text)
        val checkButton = findViewById<Button>(R.id.button_check)
        val resultText = findViewById<TextView>(R.id.result_text)

        checkButton.setOnClickListener {
            val input = input_text.text.toString().trim()

            if (input.length != 1) {
                Toast.makeText(this, "Введите 1 символ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (input[0].isUpperCase()) {
                when (input[0]) {
                    'L', 'M', 'K', 'D' -> resultText.text = "Это согласная буква"
                    else -> resultText.text = "Гласная буква"
                }
            } else {
                Toast.makeText(this, "Введите латинскую заглавную букву", Toast.LENGTH_SHORT).show()
            }
        }

    }
}