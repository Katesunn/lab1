package com.example.lab11

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.lab1)

        val input_text = findViewById<TextInputEditText>(R.id.input_text)
        val checkButton = findViewById<Button>(R.id.button_check)
        val resultText = findViewById<TextView>(R.id.result_text)



    }
}