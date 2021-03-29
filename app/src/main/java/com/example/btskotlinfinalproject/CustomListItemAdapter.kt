package com.example.btskotlinfinalproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class CustomListItemAdapter(context: Context, list: List<ListItem>) : ArrayAdapter<ListItem?>(context, 0, list) {
    private var TAG = "CustomListItemAdapter"
    private val mContext: Context = context
    private var items: List<ListItem> = list

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listItem: View = convertView ?: LayoutInflater.from(mContext)
            .inflate(R.layout.custom_ui_items, parent, false)
        val title = listItem.findViewById<TextView>(R.id.org_name)
        val email = listItem.findViewById<TextView>(R.id.email)
        val description = listItem.findViewById<TextView>(R.id.description)
        val logo = listItem.findViewById<TextView>(R.id.logo)

        title?.text = items[position].org_name
        email?.text = items[position].email
        description?.text = items[position].description
        logo?.text = items[position].logo.toString()
        return listItem
    }


}