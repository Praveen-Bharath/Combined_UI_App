package com.example.gridandlistapp

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list: ArrayList<DataModel>) : RecyclerView.Adapter<Adapter.viewholder>(){
    class  viewholder (itemView: View) : RecyclerView.ViewHolder(itemView){
            var text_value:TextView = itemView.findViewById(R.id.text_value)
            var imageView:ImageView = itemView.findViewById(R.id.imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):viewholder  {
        return viewholder (
            LayoutInflater.from(parent.context)
                .inflate(R.layout.grid_layout,parent,false)
        )
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.text_value.text = list[position].text
        holder.imageView.setImageResource(list[position].image_id)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}