package com.example.lab

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val adapter = ArticlesAdapter(getArticles())
        recyclerView.adapter = adapter
        recyclerView.layoutManager= LinearLayoutManager(this)


        }
    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()
        articles.add(Article(1, R.drawable.sample_property1, "Luxury Villa", "500,000 pkr", "A beautiful villa with modern architecture and style.", "Karachi, Pakistan"))
        articles.add(Article(2, R.drawable.sample_property2, "Modern Apartment", "300,000 pkr", "A stylish apartment located in the heart of the city.", "Lahore, Pakistan"))
        articles.add(Article(3, R.drawable.sample_property3, "Beach House", "1,000,000 pkr", "A peaceful house near the beach with stunning views.", "Gwadar, Pakistan"))
        articles.add(Article(4, R.drawable.sample_property1, "Mountain Cabin", "750,000 pkr", "A cozy cabin nestled in the mountains.", "Murree, Pakistan"))
        articles.add(Article(5, R.drawable.sample_property2, "Luxury Penthouse", "2,000,000 pkr", "A top-floor penthouse with breathtaking city views.", "Islamabad, Pakistan"))
        articles.add(Article(6, R.drawable.sample_property3, "Suburban House", "400,000 pkr", "A family-friendly house in a quiet suburban area.", "Rawalpindi, Pakistan"))
        articles.add(Article(7, R.drawable.sample_property1, "Farmhouse", "600,000 pkr", "A spacious farmhouse with large open fields.", "Multan, Pakistan"))
        articles.add(Article(8, R.drawable.sample_property2, "Lakefront Cottage", "800,000 pkr", "A serene cottage with direct access to a lake.", "Swat, Pakistan"))
        articles.add(Article(9, R.drawable.sample_property3, "City Loft", "450,000 pkr", "A compact and modern loft in a bustling city.", "Peshawar, Pakistan"))
        articles.add(Article(10, R.drawable.sample_property1, "Downtown Studio", "350,000 pkr", "A chic studio apartment in the downtown area.", "Quetta, Pakistan"))
        articles.add(Article(11, R.drawable.sample_property2, "Luxury Condo", "700,000 pkr", "A high-end condo with top-class amenities.", "Karachi, Pakistan"))
        articles.add(Article(12, R.drawable.sample_property3, "Countryside Villa", "900,000 pkr", "A large villa in the peaceful countryside.", "Bahawalpur, Pakistan"))
        articles.add(Article(13, R.drawable.sample_property1, "Modern Duplex", "550,000 pkr", "A stylish duplex with state-of-the-art design.", "Sialkot, Pakistan"))
        articles.add(Article(14, R.drawable.sample_property2, "Eco-friendly Home", "650,000 pkr", "A sustainable home with eco-friendly materials.", "Faisalabad, Pakistan"))
        articles.add(Article(15, R.drawable.sample_property3, "High-rise Apartment", "600,000 pkr", "An apartment in a high-rise building with amazing city views.", "Hyderabad, Pakistan"))
        articles.add(Article(16, R.drawable.sample_property1, "Riverside Bungalow", "950,000 pkr", "A picturesque bungalow near the riverside.", "Sukkur, Pakistan"))
        articles.add(Article(17, R.drawable.sample_property2, "Luxury Townhouse", "850,000 pkr", "A luxurious townhouse in a prestigious neighborhood.", "Islamabad, Pakistan"))
        articles.add(Article(18, R.drawable.sample_property2, "Beachfront Condo", "1,200,000 pkr", "A condo with direct access to the beach.", "Gwadar, Pakistan"))
        articles.add(Article(19, R.drawable.sample_property3, "Urban Penthouse", "2,500,000 pkr", "A top-floor penthouse in the heart of the urban area.", "Karachi, Pakistan"))
        articles.add(Article(20, R.drawable.sample_property1, "Skyscraper Apartment", "700,000 pkr", "A modern apartment in a skyscraper.", "Lahore, Pakistan"))
        articles.add(Article(21, R.drawable.sample_property2, "Historical Mansion", "3,000,000 pkr", "A beautifully restored historical mansion.", "Peshawar, Pakistan"))

        return articles
    }

}
