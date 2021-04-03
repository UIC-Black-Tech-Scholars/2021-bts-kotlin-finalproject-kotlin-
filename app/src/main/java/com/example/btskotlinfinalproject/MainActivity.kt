package com.example.btskotlinfinalproject

import android.R.id.message
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {

    private var TAG:String = "MainActivity"

    private lateinit var button: Button
    private lateinit var backButton: Button
    private lateinit var contactButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.start_bttn)
        button.setOnClickListener {
            Log.d(TAG, "CHANGE NOW")

            button.setBackgroundColor(Color.GRAY)
            backButton.setBackgroundColor(Color.BLUE)
            contactButton.setBackgroundColor(Color.BLUE)

            val name : TextView = findViewById<TextView>(R.id.ProgramName)
            val info : TextView = findViewById<TextView>(R.id.ProgramDescription)
            val req : TextView = findViewById<TextView>(R.id.ProgramRequirements)
            val image : ImageView = findViewById<ImageView>(R.id.imageview)

            name.text = "Black Tech Scholars"
            info.text = "Description: The UIC Black Tech Scholars Program started from an honest dialogue regarding racial and gender disparities in the technology sector that later cultivated into a full-fledged partnership between private and public entities committed to providing young people of color with the opportunity to acquire transferrable professional development skills and gain hands-on experiential learning opportunities."
            req.text = "Requirements:\n1. Attend UIC\n2. Actively participate in design sprint-like events\n3.  Complete a culminating project in which scholars design a mobile application.\n4. Attend career fairs\n5. BE AWESOME!!"

           val logo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqqZ2Evk-L6Z95MWah8viOh9U_ap83PbAJ1A&usqp=CAU"
            Picasso.get().load(logo).into(image)
        }

        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            Log.d(TAG, "You have pressed the back button, here is the log!!")

            button.setBackgroundColor(Color.BLUE)
            backButton.setBackgroundColor(Color.GRAY)
            contactButton.setBackgroundColor(Color.BLUE)

            val name : TextView = findViewById<TextView>(R.id.ProgramName)
            val info : TextView = findViewById<TextView>(R.id.ProgramDescription)
            val req : TextView = findViewById<TextView>(R.id.ProgramRequirements)

            name.text = "Name:"
            info.text = "Description:"
            req.text = "Requirements:"
        }

        contactButton = findViewById(R.id.contact_button)
        contactButton.setOnClickListener {
            Log.d(TAG, "EMAILING")
            button.setBackgroundColor(Color.BLUE)
            backButton.setBackgroundColor(Color.BLUE)
            contactButton.setBackgroundColor(Color.GRAY)
        }
    }

}