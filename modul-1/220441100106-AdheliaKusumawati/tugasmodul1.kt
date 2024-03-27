class Buku(val judul: String, val harga: Int, val stok: Int)

fun main() {
    val buku1 = Buku("diktaa dan hukum", 20000, 9)
    val buku2 = Buku("gadis minimarket", 30000, 5)
    val buku3 = Buku("twenty four eyes", 40000, 8)
    val daftarBuku = arrayOf(buku1, buku2, buku3)

    println("---------Selamat datang di toko buku baru---------\n")
    println("-----Judul Buku-----------Harga---------Stok------")
    for (buku in daftarBuku) {
        println("| ${buku.judul} |   Rp. ${buku.harga}    |      ${buku.stok}     |")
    }
    println("--------------------------------------------------\n")
    
    val judulBukuDibeli = "diktaa dan hukum"
    val uangPembayaran = 100000.0
    val jumlahBukuDibeli = 2

    val totalPembayaran = hitungTotalPembayaran(buku1, jumlahBukuDibeli)
    val kembalian = uangPembayaran - totalPembayaran

    if (buku1.stok >= jumlahBukuDibeli){
    if (uangPembayaran >= totalPembayaran) {
        println("----------------Total Pesanan Anda----------------")
        println("| judul buku              : $judulBukuDibeli      |")
        println("| Jumlah buku yang dibeli : $jumlahBukuDibeli                     |")
        println("| Total Pembayaran        : Rp. $totalPembayaran             |")
        println("| Uang pembayaran anda    : Rp. $uangPembayaran          |")
        println("| Kembalian               : Rp. $kembalian           |")
        println("\n----------Terimakasih atas pembelian anda----------")
    } else {
        println("Uang pembayaran customer tidak mencukupi")
    }
    }else {
        println("Maaf, stok buku ${judulBukuDibeli} tidak mencukupi.")
    }
   
    
}
fun hitungTotalPembayaran(buku: Buku, jumlahBukuDibeli: Int): Int {
    return buku.harga * jumlahBukuDibeli
}