package com.example.myapplication

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class Week4Ass1 : AppCompatActivity(), View.OnClickListener {
    private val destinations= arrayOf("Bali", "Malaysia", "Singapore")
    private lateinit var spinner: Spinner

    private lateinit var btnCheckin: Button
    private lateinit var btnCheckout: Button
    private lateinit var tvCheckin: TextView
    private lateinit var tvCheckout: TextView
    private lateinit var btnbook: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week4_ass1)

        spinner= findViewById(R.id.destinaton)


        //checkin
        btnCheckin= findViewById(R.id.btnCheckin)
        tvCheckin =findViewById(R.id.tvCheckin)


        //checkout
        btnCheckout= findViewById(R.id.btnCheckout)
        tvCheckout =findViewById(R.id.tvCheckout)


        //booking button
        btnbook = findViewById(R.id.btnbook)
        btnbook.setOnClickListener(this)

        val adapter= ArrayAdapter(
            this, android.R.layout.simple_list_item_1, destinations
        )


        spinner.adapter=adapter


        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem= parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@Week4Ass1, "Selected Item: $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


        //calender checkin
        btnCheckin.setOnClickListener {
            loadCheckin()
        }


        //calender checkout

        btnCheckout.setOnClickListener {
            loadCheckOut()
        }


    }


    //function for checkout
    private fun loadCheckOut() {
        val cout=Calendar.getInstance()
        val yearout=cout.get(Calendar.YEAR)
        val monthout=cout.get(Calendar.MONTH)
        val dayout = cout.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                tvCheckout.text = "Slected Date : $dayOfMonth/$monthOfYear/$year"
            },
            yearout,
            monthout,
            dayout
        )
        datePickerDialog.show()
    }

    //function for checkin
    private fun loadCheckin() {
        val cin=Calendar.getInstance()
        val yearin=cin.get(Calendar.YEAR)
        val monthin=cin.get(Calendar.MONTH)
        val dayin = cin.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                tvCheckin.text = "Slected Date : $dayOfMonth/$monthOfYear/$year"
            },
            yearin,
            monthin,
            dayin
        )
        datePickerDialog.show()

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btnbook ->{
                val intent = Intent(this, Bill:: class.java)
                startActivity(intent)
            }
        }
    }
}