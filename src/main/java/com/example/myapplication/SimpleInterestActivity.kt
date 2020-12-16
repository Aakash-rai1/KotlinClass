package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SimpleInterestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_interest)

        val etP: EditText = findViewById(R.id.etP)
        val etT: EditText = findViewById(R.id.etT)
        val etR: EditText = findViewById(R.id.etR)
        val btnCalc: Button =findViewById(R.id.btnCalc)
        val tvResult: TextView = findViewById(R.id.tvResult)


        btnCalc.setOnClickListener {
            val p: Int =etP.text.toString().toInt()
            val t: Int =etT.text.toString().toInt()
            val r: Int =etR.text.toString().toInt()
            val result:Int= (p*t*r)/100
            Toast.makeText(this, "result is $result", Toast.LENGTH_LONG).show()
            tvResult.text = result.toString()

        }






    }
}