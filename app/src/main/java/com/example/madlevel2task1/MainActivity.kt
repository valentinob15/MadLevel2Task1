package com.example.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.databinding.ActivityMainBinding
import androidx.recyclerview.widget.StaggeredGridLayoutManager as StaggeredGridLayoutManager1

class MainActivity : AppCompatActivity() {
    private val places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.rvPlaces.layoutManager = StaggeredGridLayoutManager1(2,StaggeredGridLayoutManager1.VERTICAL)
        binding.rvPlaces.adapter = placeAdapter
        for (i in Place.PLACE_NAMES.indices){
            places.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RES_DRAWABLE_IDS[i]))
        }
        placeAdapter.notifyDataSetChanged()
    }
}