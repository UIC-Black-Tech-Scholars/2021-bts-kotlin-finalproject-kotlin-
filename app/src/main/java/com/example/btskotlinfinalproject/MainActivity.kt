package com.example.btskotlinfinalproject

import android.R.id.message
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sendMessage(view: View){
        // Do something in response to button
        val eView = findViewById<EditText>(R.id.orgName)
        val eViewDesc = findViewById<EditText>(R.id.orgDescription)
        val messageName = eView.text.toString()
        val messageDesc = eViewDesc.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra("orgName", messageName)
        intent.putExtra("orgDesc", messageDesc)
        startActivity(intent)
    }


}