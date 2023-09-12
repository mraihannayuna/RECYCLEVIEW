package com.example.bljarrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.bljarrecyleview.databinding.ActivityDetailHeroBinding
import com.example.bljarrecyleview.databinding.ActivityMainBinding
import com.example.bljarrecyleview.model.dataClass


class activity_detail_hero : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<dataClass>("DATA")
//        if (data != null) {
//            Log.d("DATA KU",data.name)
//        }
        Glide.with(this)
            .load(data?.image)
            .into(binding.imgProfile)

        binding.tvName.text = data?.name
        binding.tvDescription.text = data?.description
    }
}