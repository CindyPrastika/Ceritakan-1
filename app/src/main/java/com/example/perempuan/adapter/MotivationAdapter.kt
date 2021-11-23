package com.example.perempuan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.perempuan.R
import com.example.perempuan.model.Story
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import kotlinx.android.synthetic.main.item_story.view.*

class MotivationAdapter(options: FirestoreRecyclerOptions<Story>):
    FirestoreRecyclerAdapter<Story, MotivationAdapter.MyViewHolder>(options) {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var title = itemView.tvTitle
        var content = itemView.tvContent
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int, model: Story) {
        holder.title.text = model.title
        holder.content.text = model.content
    }
}