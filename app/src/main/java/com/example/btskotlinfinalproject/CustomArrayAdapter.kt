package com.example.btskotlinfinalproject

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomArrayAdapter(context: Context, list: List<ListItem>) : ArrayAdapter<ListItem?>(context, 0, list) {
    private val mContext: Context = context
    private var items: List<ListItem> = list

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItem: View = convertView ?: LayoutInflater.from(mContext)
            .inflate(R.layout.custom_list_item_layout, parent, false)

        val title = listItem.findViewById<TextView>(R.id.org_name)
        val email = listItem.findViewById<TextView>(R.id.email)
        val description = listItem.findViewById<TextView>(R.id.description)
        val image: ImageView = listItem.findViewById(R.id.logo)
        val resourceImage: Int = context.resources.getIdentifier(items[position].logo, "drawable", context.packageName)

        image.setImageResource(resourceImage)

        title.text = items[position].org_name
        email?.text = items[position].email
        description.text = items[position].description.toString()


        return listItem
    }
}