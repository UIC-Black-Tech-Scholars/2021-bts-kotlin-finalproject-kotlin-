package com.example.btskotlinfinalproject

import android.graphics.Color
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class DisplayMessageActivity : AppCompatActivity() {

    private var TAG:String = "DisplayMessageActivity"

    private lateinit var contactButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val extras = intent.extras
        var mName = extras?.getString("orgName")
        mName = "Program Name: $mName"

        var mDesc = extras?.getString("orgDesc")
        mDesc = "Program Description: \n$mDesc"

        val textView = findViewById<TextView>(R.id.ProgramName).apply { text = mName }

        val textViewDesc = findViewById<TextView>(R.id.ProgramDescription).apply { text = mDesc }

        val logo = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqqZ2Evk-L6Z95MWah8viOh9U_ap83PbAJ1A&usqp=CAU"
        val image : ImageView = findViewById<ImageView>(R.id.imageview)
        Picasso.get().load(logo).into(image)


        contactButton = findViewById(R.id.contact_button)
        //contactButton.setOnClickListener {
        //  Log.d(TAG, "EMAILING")
        //button.setBackgroundColor(Color.BLUE)
        //backButton.setBackgroundColor(Color.BLUE)
        //contactButton.setBackgroundColor(Color.GRAY)
        //}
    }
}