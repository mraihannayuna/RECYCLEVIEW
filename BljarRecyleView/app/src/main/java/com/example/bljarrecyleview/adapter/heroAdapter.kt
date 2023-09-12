package com.example.bljarrecyleview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bljarrecyleview.activity_detail_hero
import com.example.bljarrecyleview.databinding.ActivityDetailHeroBinding
import com.example.bljarrecyleview.databinding.ItemViewsBinding
import com.example.bljarrecyleview.model.dataClass


class heroAdapter(var listHero: ArrayList<dataClass>): RecyclerView.Adapter<heroAdapter.ListViewHolder>() {

    class ListViewHolder(val binding:ItemViewsBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemViewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun getItemCount(): Int = listHero.size


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.image)
            .into(holder.binding.imageProfile)

        holder.binding.tvName.text = hero.name

            // ini toast
//        holder.itemView.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "Kamu memilih ${hero.name}", Toast.LENGTH_SHORT).show()
//        }

        val intent = Intent(holder.itemView.context, activity_detail_hero::class.java)

    }

}