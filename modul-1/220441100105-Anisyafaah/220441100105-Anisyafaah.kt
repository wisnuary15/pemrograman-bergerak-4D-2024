import kotlin.and

fun main() {
    println(" -- Selamat Datang di Aplikasi FlickTix! --\n")
    println("==============================================\n")
    println("Harga Tiket Untuk Semua Film Bioskop: Rp 50.000")
    println("Hanya Terdapat 2 Film yang Ditayangkan\n")

    val pemesananTiket = PemesananTiketBioskop()
    println("==============================================\n")
    for (i in 1..2) { // Looping dua kali
        println("Pemesanan ke-$i:\n")
        pemesananTiket.tampilkanJadwalFilm(i)
        println("-------------------------------------------")
    }
}

class PemesananTiketBioskop {
    val hargaTiket = 50000
    val jumlahKursiFilm1 = 100
    val jumlahKursiFilm2 = 80
    val jamTayangFilm1 = "12:00"
    val jamTayangFilm2 = "15:00"
    val film1 = "Spider-Man: No Way Home"
    val film2 = "The Batman"

    fun tampilkanJadwalFilm(nomorPemesanan: Int) {
        println("Daftar Film:")
        println("1. $film1 - Jam Tayang: $jamTayangFilm1")
        println("2. $film2 - Jam Tayang: $jamTayangFilm2")

        // Pilih film berdasarkan nomor pemesanan (genap/ganjil)
        val pilihanFilm = if (nomorPemesanan % 2 == 0) 2 else 1
        
        val jumlahKursiTersedia = if (pilihanFilm == 1) jumlahKursiFilm1 else jumlahKursiFilm2
        println("Jumlah Kursi Tersedia untuk Setiap Film yang Dipilih: $jumlahKursiTersedia\n")

		// Memesan tiket         
        if (jumlahKursiTersedia > 0) {
            val jumlahTiket = 2 // Misalnya memesan 2 tiket

            if (jumlahTiket <= jumlahKursiTersedia) {
                val totalHarga = hargaTiket * jumlahTiket
                println("Pemesanan Berhasil!")
                println("===========================================")
                println("Film: ${if (pilihanFilm == 1) film1 else film2}")
                println("Jam Tayang: ${if (pilihanFilm == 1) jamTayangFilm1 else jamTayangFilm2}")
                println("Jumlah Tiket: $jumlahTiket")
                println("Total Harga: Rp $totalHarga\n")
            } else {
                println("Maaf, jumlah kursi yang tersedia tidak mencukupi untuk memesan $jumlahTiket tiket.")
            }
        } else {
            println("Maaf, tiket untuk film yang dipilih sudah habis.")
        }
    }
}