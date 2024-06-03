package com.example.johnsmith_comp304assignment1_ex1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {


    private lateinit var textViewName: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        textViewName = findViewById(R.id.textViewName)


        val name = intent.getStringExtra("name")
        textViewName.text = name
    }
}
