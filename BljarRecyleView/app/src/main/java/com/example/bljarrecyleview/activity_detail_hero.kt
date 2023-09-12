package com.example.bljarrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bljarrecyleview.databinding.ActivityDetailHeroBinding
import com.example.bljarrecyleview.databinding.ActivityMainBinding



class activity_detail_hero : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }
}