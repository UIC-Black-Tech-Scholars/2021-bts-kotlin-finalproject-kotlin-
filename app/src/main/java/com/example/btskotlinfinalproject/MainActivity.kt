package com.example.btskotlinfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // these variables are going to be used to store the club's information
    // val programName = "HI"
    // val programDescription = "This is a great club!"
    // val programContact = "fmesa2@uic.edu"
    // val programRequirements = "You must be awesome"

    private var TAG:String = "MainActivity"

    private lateinit var button: Button
    private lateinit var backButton: Button
    private lateinit var contactButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.start_bttn)
        button.setOnClickListener {
            Log.d(TAG,"CHANGE NOW")
        }

        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            Log.d(TAG,"You have pressed the back button, here is the log!!")
        }

        contactButton = findViewById(R.id.contact_button)
        contactButton.setOnClickListener {
            Log.d(TAG,"EMAILING")
        }
    }

}