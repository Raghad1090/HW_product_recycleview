package com.example.hw_product_recycleview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.itemAdapter
import com.example.hw_product_recycleview.data.Datasource
import android.os.Binder
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        val myDataset = Datasource().loadProducts()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = itemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)


 }}



