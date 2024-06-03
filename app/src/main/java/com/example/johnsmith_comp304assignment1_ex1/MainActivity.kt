package com.example.johnsmith_comp304assignment1_ex1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var buttonSend: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextName = findViewById(R.id.editTextName)
        buttonSend = findViewById(R.id.buttonSend)


        buttonSend.setOnClickListener {
            val name = editTextName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}
