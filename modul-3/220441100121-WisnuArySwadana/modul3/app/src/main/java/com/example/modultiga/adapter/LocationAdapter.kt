package com.example.modultiga.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modultiga.R
import com.example.modultiga.data.LocationData
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class LocationAdapter(private val locationList: List<LocationData>) : RecyclerView.Adapter<LocationAdapter.PlayerViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: LocationData)
    }

    class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Name: MaterialTextView = itemView.findViewById(R.id.materialTextView2)
        val Lokasi: MaterialTextView = itemView.findViewById(R.id.textView9)
        val NameImage: ShapeableImageView = itemView.findViewById(R.id.imagelokasi)
        var description: MaterialTextView = itemView.findViewById(R.id.materialTextView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_horizontal, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val data = locationList[position]

        holder.Name.text = data.name
        holder.Lokasi.text = data.lokasi.shorten(85)
        holder.NameImage.setImageResource(data.image)
        holder.description.text = data.description

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(locationList[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int = locationList.size

    private fun String.shorten(maxLength: Int): String {
        return if (this.length <= maxLength) this else "${this.substring(0, maxLength)}..."
    }
}
