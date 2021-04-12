package com.example.btskotlinfinalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
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
        val mName = extras?.getString("name")
        val mDesc = extras?.getString("desc")
        val mEmail = extras?.getString("email")

        val image = findViewById<ImageView>(R.id.logoView)
        val resourceImage: Int = this.resources.getIdentifier(extras?.getString("logo"), "drawable", this.packageName)
        image.setImageResource(resourceImage)

        findViewById<TextView>(R.id.ProgramName).apply { text = mName }

        val textViewDesc = findViewById<TextView>(R.id.ProgramDescription).apply { text = mDesc }
        textViewDesc.movementMethod = ScrollingMovementMethod()


        val contactButton = findViewById<Button>(R.id.contact_button)
        contactButton.setOnClickListener {
            if (mEmail != null) {
                val selectorIntent = Intent(Intent.ACTION_SENDTO)
                selectorIntent.data = Uri.parse("mailto:")

                val emailIntent = Intent(Intent.ACTION_SEND)
                emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(mEmail))
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Request to Join $mName")
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hey $mName,\n\n" +
                        "I was emailing to find out more about your organization and inquire about joining.\n\n" +
                        "Thanks,")
                emailIntent.selector = selectorIntent
                startActivity(Intent.createChooser(emailIntent, "Send email..."))
            }
        }
    }
}