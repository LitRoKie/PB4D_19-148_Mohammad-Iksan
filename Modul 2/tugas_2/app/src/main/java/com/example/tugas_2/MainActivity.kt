package com.example.tugas_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = listOf(
            ItemData("Item 1", "Description for item 1"),
            ItemData("Item 2", "Description for item 2"),
            ItemData("Item 3", "Description for item 3"),
            ItemData("Item 4", "Description for item 4"),
            ItemData("Item 5", "Description for item 5"),
            ItemData("Item 6", "Description for item 6"),
            ItemData("Item 7", "Description for item 7"),
            ItemData("Item 8", "Description for item 8")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(data)
    }
}

data class ItemData(val title: String, val description: String)

class ItemAdapter(private val data: List<ItemData>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = data.size
}

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: ItemData) {
        itemView.findViewById<TextView>(R.id.title).text = item.title
        itemView.findViewById<TextView>(R.id.description).text = item.description

    }
}