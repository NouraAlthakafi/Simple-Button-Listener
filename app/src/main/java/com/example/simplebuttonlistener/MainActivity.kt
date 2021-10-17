package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttonK: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonK = findViewById(R.id.button)

        buttonK.setOnClickListener{
            Toast.makeText(applicationContext, "Coding", Toast.LENGTH_SHORT).show()
        }
    }
    fun buttonX(view: View){
        Toast.makeText(applicationContext, "Xml", Toast.LENGTH_SHORT).show()
    }
}