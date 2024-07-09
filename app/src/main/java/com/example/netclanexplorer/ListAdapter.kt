package com.example.netclanexplorer

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val dataList: ArrayList<String>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.listitemlayout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data= dataList[position]
        holder.name.text = data


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return dataList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
      val name = itemView.findViewById<TextView>(R.id.name)
        val profile_text = itemView.findViewById<TextView>(R.id.profile_text)
    }
}
