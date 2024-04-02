class JastipGacoan(val menu: String, var stok: Int, val harga: Int) {
    
    fun pilih(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("=================================================")
            println("Anda telah membeli " + jumlah + " " + menu + " seharga Rp" + (jumlah * harga) + ".")
            println("=================================================")
        } else {
            println("=================================================")
            println("Maaf, stok " + menu + " tidak mencukupi.")
            println("=================================================")
        }
    }
}

fun main() {
    println("Selamat datang di Layanan Jastip Gacoan")

    val menuMieSuit = JastipGacoan("Mie Suit", 10, 9000)
    val menuMieHompimpa = JastipGacoan("Mie Hompimpa", 5, 10000)
    val menuMieGacoan = JastipGacoan("Mie Gacoan", 8, 11000)

    println("Daftar Menu:")
        println("1. " + menuMieSuit.menu + " - Rp" + menuMieSuit.harga)
        println("2. " + menuMieHompimpa.menu + " - Rp" + menuMieHompimpa.harga)
        println("3. " + menuMieGacoan.menu + " - Rp" + menuMieGacoan.harga)


    val menuIndex = 2 // Pilih menu secara statis
    var menuTerpilih: JastipGacoan? = null

    println("=================================================")
    println("Menu mana yg anda pilih? <2>")
    println("Berapa mie yang dibeli? <2>")
    println("=================================================")

    if (menuIndex == 1) {
        menuTerpilih = menuMieSuit
    } else if (menuIndex == 2) {
        menuTerpilih = menuMieHompimpa
    } else if (menuIndex == 3) {
        menuTerpilih = menuMieGacoan
    } else {
        println("Pilihan tidak valid")
    }

    if (menuTerpilih != null) {
        val jumlah = 2 // Jumlah yang ingin dibeli secara statis
        menuTerpilih.pilih(jumlah)
    }
}
