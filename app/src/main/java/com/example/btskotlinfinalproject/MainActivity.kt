package com.example.btskotlinfinalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"
    private lateinit var listView: ListView
    private lateinit var dataList: ArrayList<ListItem>
    private lateinit var customArrayAdapter:CustomListItemAdapter
    private var gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resources.openRawResource(R.raw.organization_info).bufferedReader().use {
            val stype = object : TypeToken<ArrayList<ListItem>>() {}.type
            dataList = gson.fromJson(it.readText(), stype)
        }
        //find view objects
        listView = findViewById(R.id.list_view)

        //create list data
        dataList.forEach { item ->
            Log.d(TAG, item.toString())
        }
        //hook list data up to our list using array adapter
        customArrayAdapter = CustomListItemAdapter(this, dataList)
        listView.adapter = customArrayAdapter

    }
}