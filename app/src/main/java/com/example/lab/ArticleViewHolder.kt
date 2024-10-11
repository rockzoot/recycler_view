package com.example.lab

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val propertyImage: ImageView = itemView.findViewById(R.id.property_image_1)
    val propertyName: TextView = itemView.findViewById(R.id.property_name_1)
    val propertyPrice: TextView = itemView.findViewById(R.id.property_price_1)
    val propertyDescription: TextView = itemView.findViewById(R.id.property_description_1)
    val propertyLocation: TextView = itemView.findViewById(R.id.property_location_1)

}