fun main() {
    println("selamat datang di aplikasi Inventori Sepatu Sederhana")
    println("|------------------------------------------------------|")
    println("silahkan masukkan yang ingin anda lakukan")
    
    println("1. cek barang\n2. tambah barang\n3. kurang barang")
    println("|------------------------------------------------------|")
    val toko = TokoSepatu()
    toko.kondisi(1)
    println("|------------------------------------------------------|")
    
    for (i in 1..1) {
        toko.kondisi(2)
        println("|------------------------------------------------------|")
    }
    
    for (i in 1..1) {
        toko.kondisi(1)
        println("|------------------------------------------------------|")
    }
    
    for (i in 1..1) {
        toko.kondisi(3)
        println("|------------------------------------------------------|")
    }
}

class TokoSepatu() { 
    var barang = 1
    
    fun kondisi(x: Int): Int {
        if (x == 2) {
            barang++
            println("Stok berhasil ditambahkan cuiii ")
        } else if (x == 3) {
            barang--
            println("Rill Stok berhasil dikurangi")
        } else if (x == 1) {
            println("Stok saat ini brohh = barang ")
        } else {
            println("cuma sampe 3 doangg masa ga liatt!!")
        }
        return barang
    }
}
