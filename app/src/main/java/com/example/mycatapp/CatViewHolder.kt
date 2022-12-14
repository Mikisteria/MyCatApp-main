package com.example.mycatapp

import android.view.View
import android.view.View.FIND_VIEWS_WITH_TEXT
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class CatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name : TextView = itemView.findViewById(R.id.lblName)
    val url : TextView = itemView.findViewById(R.id.lblUrl)
    val temperament : TextView = itemView.findViewById(R.id.lblTemperament)
    val origin : TextView = itemView.findViewById(R.id.lblOrigin)
    val description : TextView = itemView.findViewById(R.id.lblDescription)
    val image_url: ImageView = itemView.findViewById(R.id.imageCat)

}