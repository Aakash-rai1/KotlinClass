package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("My Alert")
            //set message for alert dialog
            builder.setMessage("Are you syre?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            //performin positive action
            builder.setPositiveButton("yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "Clicked yes", Toast.LENGTH_LONG).show()
            }
            //performing cancle action
            builder.setNeutralButton("Cancle") { dialogInterface, which ->
                Toast.makeText(
                    applicationContext,
                    "clicked cancel\n operation cancel",
                    Toast.LENGTH_LONG
                ).show()



            }

            //performing negative action
            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(applicationContext,
                    "clicked No",
                    Toast.LENGTH_LONG
                ).show()
            }
            //create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}