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
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.hw_product_recycleview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val myDataset = Datasource().loadProducts()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = itemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viwe = inflater.inflater(R.layout.activity_main, container, false)

        return view

        viwe.buybutton.setOnClickListtener {
            Navigation.findNavController(viwe).navigate(R.id.first_fragment)
        }

    }
}


