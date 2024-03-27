fun main() {
    val objekHitung = hitung()
    var lanjut: Boolean

    do {
        println("Anda ingin menghitung : ")
        println("========================================")
        println("1. Luas Persegi")
        println("2. Luas Segitiga")
        println("3. Luas Lingkaran")
        println("========================================")
        println("Pilih yang Akan Di Hitung: ")

        val pilihan =  2 

        if (pilihan == 1) {
            objekHitung.hitunglpersegi(8.8, 9.8) // Menggunakan nilai yang sudah ditentukan
        } else if (pilihan == 2) {
            objekHitung.hitunglsegitiga(8.8, 9.8)
        } else if (pilihan == 3) {
            objekHitung.hitungllingkaran(5.0)
        } else {
            println("pilihan tidak valid")
        }

        println("Apakah Anda ingin menghitung lagi? (true/false): ")
        lanjut = false

    } while (lanjut)

    println("Terima kasih telah menggunakan program ini.")
}


class hitung {
    fun hitunglpersegi(p: Double, l: Double) {
        println("Menghitung Luas Persegi")
        println("Panjang Persegi: $p")
        println("Lebar Persegi: $l")
        println("Luas Persegi = ${p * l}")
    }

    fun hitunglsegitiga(a: Double, t: Double) {
        println("Menghitung Luas Segitiga")
        println("Alas Segitiga: $a")
        println("Tinggi Segitiga: $t")
        println("Luas Segitiga = ${0.5 * a * t}")
    }

    fun hitungllingkaran(jari: Double) {
        println("Menghitung Luas Lingkaran")
        println("Jari-Jari Lingkaran: $jari")
        println("Luas Lingkaran = ${3.14 * jari * jari}")
    }
}