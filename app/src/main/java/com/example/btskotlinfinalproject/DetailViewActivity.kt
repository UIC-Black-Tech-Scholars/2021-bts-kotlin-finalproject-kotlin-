package com.example.btskotlinfinalproject

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailViewActivity : AppCompatActivity() {

    private var TAG:String = "DisplayMessageActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)
        ;

        val extras = intent.extras
        var mName = extras?.getString("name")

        val mDesc = extras?.getString("desc")

        val image = findViewById<ImageView>(R.id.logoView)
        val resourceImage: Int = this.resources.getIdentifier(extras?.getString("logo"), "drawable", this.packageName)
        image.setImageResource(resourceImage)

        val textView = findViewById<TextView>(R.id.ProgramName).apply { text = mName }

        val textViewDesc = findViewById<TextView>(R.id.ProgramDescription).apply { text = mDesc }
        textViewDesc.movementMethod = ScrollingMovementMethod()


        val contactButton = findViewById<Button>(R.id.contact_button)
        contactButton.setOnClickListener {
          Log.d(TAG, "Opening email intent")
            val email = extras?.getString("email")
            val intent = Intent(this, EmailActivity::class.java)
            intent.putExtra("to", email)
            startActivity(intent)
        }
    }
}