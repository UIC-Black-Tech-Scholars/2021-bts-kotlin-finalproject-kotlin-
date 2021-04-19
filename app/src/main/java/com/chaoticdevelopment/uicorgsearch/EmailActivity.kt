package com.chaoticdevelopment.uicorgsearch

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val editTextTo = findViewById<EditText>(R.id.editText1)
        val editTextSubject = findViewById<EditText>(R.id.editText2)
        val editTextMessage = findViewById<EditText>(R.id.editText3)

        val send = findViewById<Button>(R.id.button1)
        send.setOnClickListener(View.OnClickListener {
            val to = editTextTo.text.toString()
            val subject = editTextSubject.text.toString()
            val message = editTextMessage.text.toString()

            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, to)
            email.putExtra(Intent.EXTRA_SUBJECT, subject)
            email.putExtra(Intent.EXTRA_TEXT, message)
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, "Choose an Email client :"))

        })

    }
}

