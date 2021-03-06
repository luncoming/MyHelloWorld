package com.example.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{ rollDice()}
    }

    private fun rollDice(){

        val randomNumb = (1..9999).random()


        val numberText: TextView = findViewById(R.id.textView)
        numberText.text = randomNumb.toString()
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()


    }
}