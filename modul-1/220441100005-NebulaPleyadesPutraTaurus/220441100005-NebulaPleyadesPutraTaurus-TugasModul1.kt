// class nya terlebih dahulu di deklarasikan sebelum program main nantinya dijalankan
class Senjata(val namaSenjata: String, val hargaSenjata: String, val hargaSenjataAsli: Int)
class Amunisi(val namaAmunisi: String, val hargaAmunisi: String, val hargaAmunisiAsli: Int)

fun main() {
    println("Selamat datang di toko Mamat Gunshop")
    println("--------------------------------------------------")
    println("Toko yang menjual berbagai senjata api dan amunisi")

    // Membuat list dari variabel senjata
    val daftarSenjata = listOf(
        Senjata("AK47 (Versi bekas perang teluk)", "Rp. 10.000.000", 10000000),
        Senjata("M4A1 (Versi bekas perang afganistan)", "Rp. 20.000.000", 20000000),
        Senjata("Panzerfaust30", "Rp. 15.000.000", 15000000),
        Senjata("Uzi (Versi bekas perang enam hari)", "Rp. 7.000.000", 7000000)
    )

    // Membuat list dari variabel amunisi
    val daftarAmunisi = listOf(
        Amunisi("7,62mm", "Per-box Rp. 2.500.000", 2500000),
        Amunisi("5,56mm (Standar NATO)", "Per-box Rp. 2.800.000", 2800000),
        Amunisi(".45mm (Standar U.S Army)", "Per-box Rp. 800.000", 800000)
    )

    // Menampilkan senjata dan amunisi yang tersedia
    // Tujuan tanda $ menggabungkan nilai variabel atau ekspresi ke dalam sebuah string literal (string template) 
    println("Senjata Yang Tersedia: ")
    for ((index, senjata) in daftarSenjata.withIndex()) {
        println("${index + 1}. ${senjata.namaSenjata} - ${senjata.hargaSenjata}")
    }

    println("=======================================================")

    println("Peluru Yang Tersedia: ")
    for ((index, amunisi) in daftarAmunisi.withIndex()) {
        println("${index + 5}. ${amunisi.namaAmunisi} - ${amunisi.hargaAmunisi}")
    }

    // Karena ini adalah program statis, maka indeks-nya langsung ditentukan saja
    val pilihanSenjata = 1 
    val pilihanAmunisi = 3 

    // Pada bagian ini tujuannya yakni untuk menjumlahkan semua harga barangnya
    var totalHarga = 0

    println("=======================================================")
    println("Berikut senjata dan amunisi yang kamu pilih serta harganya: ")
    
    // Pengecekan senjata yang terpilih
    if (pilihanSenjata in 1..4) {
        val senjataTerpilih = daftarSenjata[pilihanSenjata - 1]
        println("Senjata Yang Dipilih: ${senjataTerpilih.namaSenjata} - ${senjataTerpilih.hargaSenjata}")
        totalHarga += senjataTerpilih.hargaSenjataAsli // menambahkan harga senjata ke total harga

        // Jika pada indeks yang ditentukan sebelumnya mengacu dan memilih amunisi, maka pilihannya akan ditambahkan juga dengan senjata yang sudah dipilih
        if (pilihanSenjata == 1 && pilihanAmunisi in 1..2) {
            val amunisiTerpilih = daftarAmunisi[pilihanAmunisi - 3]
            println("Amunisi Yang Dipilih: ${amunisiTerpilih.namaAmunisi} - ${amunisiTerpilih.hargaAmunisi}")
            totalHarga += amunisiTerpilih.hargaAmunisiAsli // menambahkan harga amunisi ke variabel totalHarga
        } 
        println("----------------------------------------------")
        println("Total Harga: Rp. $totalHarga")
        println("Terima Kasih Telah Berbelanja di Mamad Gunshop, solusi andalan untuk tembak-menembakmu")
    } else {
        println("Nguwawur loh pilihan tidak ada di list")
    }
}
