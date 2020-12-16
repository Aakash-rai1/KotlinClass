
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    //gobal
    private lateinit var tvResult: TextView
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnAdd: Button
    private lateinit var rdoAdd: RadioButton
    private lateinit var rdoSub: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //reference
        tvResult =findViewById(R.id.tvResult)
        etFirst =findViewById(R.id.etFirst)
        etSecond =findViewById(R.id.etSecond)
        btnAdd = findViewById(R.id.btnAdd)
        rdoAdd = findViewById(R.id.rdoAdd)
        rdoSub = findViewById(R.id.rdoSub)




        //Reference / Binding

//        val etFirst: EditText = findViewById(R.id.etFirst)
//        val etSecond: EditText = findViewById(R.id.etSecond)
////        val btnAdd: Button = findViewById(R.id.btnAdd)
//        val tvResult: TextView = findViewById(R.id.tvResult)
//        val rdoAdd: RadioButton= findViewById(R.id.rdoAdd)
//        val rdoSub: RadioButton= findViewById(R.id.rdoSub)


        //click listener

        btnAdd.setOnClickListener {
            retrieveValues()
        }

//        rdoAdd.setOnClickListener {
//            val first: Int =etFirst.text.toString().toInt()
//            val second: Int =etSecond.text.toString().toInt()
//
//            var result: Int=0
//            if(rdoAdd.isChecked){
//                result =first+second
//            }
//            else if(rdoSub.isChecked){
//                result=first-second
//            }
//            Toast.makeText(this, "result is $result",Toast.LENGTH_LONG).show()
//            tvResult.text = result.toString()
//        }


        
    }

    private fun retrieveValues() {
        val first: Int = etFirst.text.toString().toInt()
        val second: Int = etSecond.text.toString().toInt()

        var result: Int = 0
        if (rdoAdd.isChecked) {
            result = first + second
        } else if (rdoSub.isChecked) {
            result = first - second
        }
    }

        //no return type
        private fun multiply(first:Int, second: Int){
            val result = first* second
            tvResult.text= result.toString()
        }

        //return type
        private fun add(first:Int, second: Int):Int{
            return first+ second
    }

    private fun sub(first:Int, second: Int):Int{
        return first -second
    }

    //function no return type


}