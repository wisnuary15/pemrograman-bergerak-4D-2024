class Warung(
    public val menu: List<String>,
    public val harga: List<Int>,
    public val uangDefault: Int = 50000
) {
    fun tampilkanMenu() {
        println("Menu Makanan:")
        menu.forEachIndexed { index, item -> println("${index + 1}. $item - Rp ${harga[index]}") }
    }

    fun pesanMenu(pesanan: List<Int>?): Pair<Int, Int> {
        if (pesanan == null || pesanan.isEmpty()) {
            println("Input tidak valid atau tidak ada pesanan.")
            return Pair(0, 0)
        }
        var totalHarga = 0
        for (index in pesanan) {
            if (index in 0 until menu.size) {
                totalHarga += harga[index]
            } else {
                println("Menu dengan nomor ${index + 1} tidak tersedia.")
                continue
            }
        }
        val kembalian = uangDefault - totalHarga
        val kembalianNonNegative = if (kembalian < 0) 0 else kembalian
        return Pair(totalHarga, kembalianNonNegative)
    }
}

fun main() {
    val warung = Warung(
        listOf(
            "Pecel", "Soto", "Geprek", "Nasi Campur", "Rawon",
            "Penyetan", "Teh Panas/Dingin", "Kopi Panas/Dingin", "Es Jeruk", "Gorengan"
        ),
        listOf(8000, 10000, 9000, 9000, 12000, 10000, 2000, 3000, 50000, 1000)
    )
    println("== Program Pemesanan Makanan di Warung ==")
    var lanjutPesan = true
    while (lanjutPesan) {
        warung.tampilkanMenu()
        println("Masukkan nomor menu yang ingin Anda beli (pisahkan dengan spasi):")
        val inputMenu = readLine()
        val pesananYangDipilih = inputMenu?.split(" ")?.mapNotNull { it.toIntOrNull()?.minus(1) }
        val (totalHarga, kembalian) = warung.pesanMenu(pesananYangDipilih)
        if (totalHarga > 0) {
            println("Pesanan Anda:")
            pesananYangDipilih?.forEach { index ->
                println("${warung.menu.getOrNull(index) ?: ""} - Rp ${warung.harga.getOrNull(index) ?: 0}")
            }
            println("Total Harga: Rp$totalHarga")
            println("Uang yang Anda bayarkan: Rp${warung.uangDefault}")
            println("Kembalian: Rp$kembalian")
        }
        println("Apakah Anda ingin memesan lagi? (y/n)")
        val lanjutkan = readLine()
        lanjutPesan = lanjutkan?.equals("y", ignoreCase = true) ?: false
    }
    println("Terima kasih telah menggunakan layanan kami!")
}
