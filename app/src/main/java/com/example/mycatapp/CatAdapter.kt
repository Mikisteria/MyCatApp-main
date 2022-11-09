package com.example.mycatapp

import android.content.ContentValues.TAG
import android.content.Context
import android.nfc.Tag
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CatAdapter(var items: MutableList<Cat>, context: Context) : RecyclerView.Adapter<CatViewHolder>() {

    private val context = context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cat_item, parent, false)
        return CatViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.name.text = items[position].name
        holder.url.text = items[position].id
        holder.temperament.text = items[position].temperament
        holder.origin.text = items[position].origin
        holder.description.text = items[position].description

        Log.d(TAG, items[position].image.url)

        Glide.with(context)
            .load(items[position].image.url)
            .placeholder(com.google.android.material.R.drawable.ic_clock_black_24dp)
            .centerCrop()
            .into(holder.image_url)
        }





    override fun getItemCount(): Int {
        return items.size
    }

    fun Update(items_new: MutableList<Cat>){
        items = items_new
        this.notifyDataSetChanged()
    }

}