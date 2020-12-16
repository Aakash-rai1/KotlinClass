package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class gameNum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_num)

        val count=0

        val valOne: Button = findViewById(R.id.valOne)
        val valTwo: Button = findViewById(R.id.valTwo)
        val tvResult: TextView = findViewById(R.id.tvResult)

        valOne.setOnClickListener {
            


        }


        valTwo.setOnClickListener {


        }



    }
}