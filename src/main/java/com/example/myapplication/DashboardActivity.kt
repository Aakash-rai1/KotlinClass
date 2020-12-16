package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnDatePicker: Button
    private lateinit var btnTimePicker: Button
    private lateinit var btnAlertDialog: Button
    private lateinit var btnUserProfile: Button
    private lateinit var btnListView: Button
    private lateinit var btnCountries: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnDatePicker = findViewById(R.id.btnDatePicker)
        btnTimePicker = findViewById(R.id.btnTimePicker)
        btnAlertDialog = findViewById(R.id.btnAlertDialog)
        btnUserProfile = findViewById(R.id.btnUserProfile)
        btnListView = findViewById(R.id.btnListView)
        btnCountries = findViewById(R.id.btnCountries)

        btnDatePicker.setOnClickListener(this)
        btnTimePicker.setOnClickListener(this)
        btnListView.setOnClickListener(this)
        btnCountries.setOnClickListener(this)
        btnAlertDialog.setOnClickListener(this)
        btnUserProfile.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnDatePicker -> {
                val intent = Intent(this@DashboardActivity,
                    DatePickerActivity::class.java)
                startActivity(intent)
            }
            R.id.btnTimePicker -> {
                val intent = Intent(this@DashboardActivity, TimePickerActivity::class.java)
                startActivity(intent)
            }
            R.id.btnUserProfile -> {
                val intent = Intent(this@DashboardActivity, MainActivity::class.java)
                startActivity(intent)
            }
//            R.id.btnAlertDialog -> {
//                val intent = Intent(this@DashboardActivity, AlertActivity::class.java)
//                startActivity(intent)
//            }
            R.id.btnListView -> {
                val intent = Intent(this@DashboardActivity, ListViewActivity::class.java)
                startActivity(intent)
            }
//            R.id.btnCountries -> {
//                val intent = Intent(this@DashboardActivity, CountrycapitalActivity::class.java)
//                startActivity(intent)
//            }
        }
    }

}