package com.example.lab

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(val articles: List<Article>): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
       val article = articles.get(position)
        holder.propertyImage.setImageResource(article.image)
        holder.propertyName.text = article.name
        holder.propertyPrice.text = article.price
        holder.propertyDescription.text = article.description
        holder.propertyLocation.text = article.location
        holder.itemView.setOnClickListener {
            Log.d("Testing", "clicked")
            val intent = Intent(holder.itemView.context, ArticleDetailsActivity::class.java)
            intent.putExtra("title", article.id)
            intent.putExtra("category", article.name)
            intent.putExtra("date", article.price)
            intent.putExtra("image", article.image)
            intent.putExtra("detail", article.description)

            holder.itemView.context.startActivity(intent)
        }



    }
}