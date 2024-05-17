package com.example.modultiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modultiga.adapter.HotelAdapter
import com.example.modultiga.adapter.LocationAdapter
import com.example.modultiga.data.DestinasiList
import com.example.modultiga.data.HotelData
import com.example.modultiga.data.LocationData
import com.google.android.material.textview.MaterialTextView

class BerandaActivity : AppCompatActivity() {
    private lateinit var locationAdapter: LocationAdapter
    private lateinit var hotelAdapter: HotelAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var horizontalRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val getDataName = intent.getStringExtra("Nama")
        val displayTitle = findViewById<MaterialTextView>(R.id.materialTextView)
        displayTitle.text = "Hi, $getDataName"

        recyclerView = findViewById(R.id.grid)
        horizontalRecyclerView = findViewById(R.id.recyclerView)

        locationAdapter = LocationAdapter(DestinasiList.LokasiDum)
        hotelAdapter = HotelAdapter(DestinasiList.HotelDum)

        setupRecyclerView()
        setupClickListeners()
    }

    private fun setupRecyclerView() {
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = hotelAdapter

        horizontalRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        horizontalRecyclerView.adapter = locationAdapter
    }

    private fun setupClickListeners() {
        locationAdapter.setOnItemClickCallback(object : LocationAdapter.OnItemClickCallback {
            override fun onItemClicked(data: LocationData) {
                showSelectedLocation(data)
            }
        })

        hotelAdapter.setOnItemClickCallback(object : HotelAdapter.OnItemClickCallback {
            override fun onItemClicked(data: HotelData) {
                showSelectedHotel(data)
            }
        })
    }

    private fun showSelectedLocation(data: LocationData) {
        val navigateToDetail = Intent(this, DetailActivity::class.java)
        navigateToDetail.putExtra("name", data.name)
        navigateToDetail.putExtra("lokasi", data.lokasi)
        navigateToDetail.putExtra("image", data.image)
        navigateToDetail.putExtra("detail", data.detail)
        startActivity(navigateToDetail)
    }

    private fun showSelectedHotel(data: HotelData) {
        val navigateToDetail = Intent(this, DetailActivity::class.java)
        navigateToDetail.putExtra("name", data.nama)
        navigateToDetail.putExtra("detail", data.detail)
        navigateToDetail.putExtra("image", data.gambar)
        startActivity(navigateToDetail)
    }
}
