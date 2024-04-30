class Opsi(val nama: String)

class Tampilan(val nama: String) {
    fun menu() {
        println("Selamat Datang di Game Tukaran")
        println("------------------------------")
        println("Silahkan Pilih Karakter")
    }
    
    fun pilihKarakter(opsiIndex: Int): Opsi? {
        return when (opsiIndex) {
            1 -> Opsi("Naruto")
            2 -> Opsi("Goku")
            3 -> Opsi("Luffy")
            else -> null
        }
    }
    
    fun batas() {
        for (i in 1..30) {
            print("-")
        }
        println()
    }
}

fun main() {
    val karakter = listOf(
        Opsi("1. Naruto"),
        Opsi("2. Goku"),
        Opsi("3. Luffy")
    )

    // Inisialisasi tampilan
    val tampilan = Tampilan("game tukaran")

    // Tampilkan menu
    tampilan.menu()

    // Cetak daftar karakter
    println("Daftar Karakter:")
    for (opsi in karakter) {
        println(opsi.nama)
    }
    
    tampilan.batas()
    
    // Pilih karakter
    val menuIndex = 2
    val memilihKarakter = tampilan.pilihKarakter(menuIndex)
    
    println("Pilihan = $menuIndex")
    
    if (memilihKarakter != null) {
        println("Karakter yang anda pilih adalah ${memilihKarakter.nama}")
        println("-----------------------------------------------------")
        println("Kekuatan")
        when (memilihKarakter.nama) {
            "Naruto" -> println(">>Rasengan")
            "Goku" -> println(">>Bola Cahaya")
            "Luffy" -> println(">>Buah Iblis")
            else -> println("Karakter tidak memiliki keahlian khusus.")
        }
        
    } else {
        println("Pilihan karakter tidak valid.")
    }
}
