class Obat(val nama: String, var jumlah: Int, var harga: Double) {
    
    fun tambahStok(jumlahTambah: Int) {
        jumlah += jumlahTambah
    }

    fun kurangiStok(jumlahKurang: Int) {
        if (jumlah - jumlahKurang >= 0) {
            jumlah -= jumlahKurang
        } else {
            println("Stok tidak mencukupi!")
        }
    }
    
    fun hitungTotalHarga(jumlahBeli: Int): Double {
        return jumlahBeli * harga
    }
}

fun cekUangPembeli(uangPembeli: Double, totalHarga: Double) {
    if (uangPembeli >= totalHarga) {
        val kembalian = uangPembeli - totalHarga
        println("Kembalian: Rp $kembalian")
    } else {
        println("Maaf, uang pembeli tidak mencukupi.")
    }
}

fun main() {
    println("Selamat datang di Apotek ")
    println("Berikut Daftar Obat yang Tersedia:")
    
    val obats = listOf(
        Obat("Paracetamol", 3, 2000.0),
        Obat("CTM", 5, 3000.0),
        Obat("Amoxilin", 7, 5000.0)
    )
    
    for (obat in obats) {
        println("${obat.nama}: Stok ${obat.jumlah}, Harga: Rp ${obat.harga}")
    }
    
    println("\nSetelah kurangi stok:")
    for (obat in obats) {
        obat.kurangiStok(1)
    }
    
    for (obat in obats) {
        println("${obat.nama}: Stok ${obat.jumlah}")
    }
    
    val totalHargaParacetamol = obats[0].hitungTotalHarga(2)
    val totalHargaAmoxilin = obats[2].hitungTotalHarga(2)
    val totalHarga = totalHargaParacetamol + totalHargaAmoxilin
    
    val uangPembeli = 20000.0 // Inisiasi nilai uang pembeli
    println("\nTotal harga untuk pembelian 2 Paracetamol dan 2 Amoxilin: Rp $totalHarga")
    
    cekUangPembeli(uangPembeli, totalHarga)
}