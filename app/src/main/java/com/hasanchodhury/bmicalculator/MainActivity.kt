package com.hasanchodhury.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<TextView>(R.id.btn)

        btn.setOnClickListener {
            val result = findViewById<TextView>(R.id.result)
            val age = findViewById<TextView>(R.id.age).text.toString()
            val male = findViewById<TextView>(R.id.male)
            val female = findViewById<TextView>(R.id.female)
            val height = findViewById<TextView>(R.id.height).text.toString()
            val weight = findViewById<TextView>(R.id.weight).text.toString()

            result.text = ("Age- $age, Height- $height, Weight- $weight")
        }
    }
}