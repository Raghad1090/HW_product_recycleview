package com.example.hw_product_recycleview.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.R
//import com.example.hw_product_recycleview.first_activity
import com.example.hw_product_recycleview.model.products
import com.google.android.material.transition.Hold

class itemAdapter(
        private val context: Context,
        private val dataset: List<products>
    ) : RecyclerView.Adapter<itemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {


        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textView2: TextView = view.findViewById(R.id.item_title2)
        val imageView1: ImageView = view.findViewById(R.id.starimage)
        val buybutton : Button = view.findViewById(R.id.buybutton)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)


    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.imageView.setImageResource(item.imageResourceId)
        holder.textView.text = context.resources.getString(item.StringResourceId)
        holder.textView.text = context.resources.getString(item.StringResourceId1)
//        holder.textView.text = context.resources.getBoolean(item.StringResourceId2)
        holder.textView.text = context.resources.getString(item.StringResourceId3)
        holder.imageView1.isVisible = item.StringResourceId2

        holder.buybutton.setOnClickListener{

            if(item.StringResourceId3 > 0){
//                val intent = Intent(context, first_activity ::class.java)
//                intent.putExtra("product" , item.StringResourceId)
//                it.context.startActivity(intent)

            } else

            Toast.makeText(context, "the product is not available right now", Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
