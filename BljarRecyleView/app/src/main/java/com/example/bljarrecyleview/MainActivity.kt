package com.example.bljarrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bljarrecyleview.adapter.heroAdapter
import com.example.bljarrecyleview.databinding.ActivityMainBinding
import com.example.bljarrecyleview.model.dataClass

class MainActivity : AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<dataClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvHeroes = binding.rvMain
        rvHeroes.setHasFixedSize(true)

        list.addAll(getListHeroes())

        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)

        val listHeroAdapter = heroAdapter(list)
        rvHeroes.adapter = listHeroAdapter
    }

    private fun getListHeroes(): ArrayList<dataClass> {
        val name = resources.getStringArray(R.array.data_name)
        val description = resources.getStringArray(R.array.data_description)
        val image = resources.obtainTypedArray(R.array.data_photo)
        val listHero = ArrayList<dataClass>()

        for (i in name.indices) {
            val hero = dataClass(
                name[i],
                description[i],
                image.getResourceId(i, -1)
            )
            listHero.add(hero)
        }

        image.recycle()

        return listHero
    }
}
