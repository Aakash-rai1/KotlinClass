package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class DatePickerActivity : AppCompatActivity() {

    private lateinit var btnDatePicker:Button
    private lateinit var tvDate : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        btnDatePicker = findViewById(R.id.btnDatePicker)
        tvDate = findViewById(R.id.tvDate)

        btnDatePicker.setOnClickListener {
            LoadCalendar()
        }
    }

    private fun LoadCalendar() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                tvDate.text = "Slected Date : $dayOfMonth/$monthOfYear/$year"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }



}