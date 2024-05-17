package com.example.modultiga.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modultiga.R
import com.example.modultiga.data.HotelData
import com.google.android.material.imageview.ShapeableImageView

// Kelas adapter untuk RecyclerView dengan tampilan GridLayoutManager
class HotelAdapter(private val hotelList: List<HotelData>) : RecyclerView.Adapter<HotelAdapter.PlayerViewHolder>() {

    // Deklarasi variabel untuk callback ketika item diklik
    private lateinit var onItemClickCallback: OnItemClickCallback

    // Fungsi untuk mengatur callback ketika item diklik
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    // Interface untuk callback ketika item diklik
    interface OnItemClickCallback {
        fun onItemClicked(data: HotelData)
    }

    // Kelas ViewHolder untuk menyimpan referensi view yang digunakan dalam RecyclerView
    class PlayerViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hotelName: TextView = itemView.findViewById(R.id.textView10)
        val deskripsi: TextView = itemView.findViewById(R.id.textView1)
        val hotelJumlah: TextView = itemView.findViewById(R.id.textView11)
        val hotelRating: TextView = itemView.findViewById(R.id.textView12)
        val hotelImage: ShapeableImageView = itemView.findViewById(R.id.imagehotel)
    }

    // Fungsi untuk membuat ViewHolder (Melakukan setting untuk XML yang akan kita gunakan untuk menampilkan data)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_grid, parent, false)
        return PlayerViewHolder(view)
    }

    // Fungsi untuk mengikat data dengan ViewHolder (memasukkan data yang kita miliki ke dalam XML ViewHolder)
    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val data = hotelList[position]
        holder.hotelName.text = data.nama
        holder.hotelJumlah.text = data.jumlah_pengunjung.toString()
        holder.hotelRating.text = data.rating.toString()
        holder.hotelImage.setImageResource(data.gambar)
        holder.deskripsi.text = data.deskripsi.toString()

        // Mengatur aksi ketika item diklik
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(hotelList[holder.adapterPosition]) }
    }

    // Fungsi untuk mendapatkan jumlah item
    override fun getItemCount(): Int = hotelList.size

    // Fungsi untuk memendekkan teks jika melebihi panjang maksimum
    private fun String.shorten(maxLength: Int): String {
        return if (this.length <= maxLength) this else "${this.substring(0, maxLength)}..."
    }
}