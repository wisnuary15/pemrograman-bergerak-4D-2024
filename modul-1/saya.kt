import java.util.Scanner

class Restoran {
    private val Menu = mutableMapOf<String, Int>()

    init {
        Menu["Nasi Goreng"] = 15000
        Menu["Mie Goreng"] = 12000
        Menu["Ayam Bakar"] = 25000
        Menu["Sop Buntut"] = 35000
    }

    fun lihatMenu() {
        if (Menu.isNotEmpty()) {
            println("Menu Restoran:")
            var nomorMenu = 1
            for ((nama, harga) in Menu) {
                println("$nomorMenu $nama: Rp $harga")
                nomorMenu++
            }
        } else {
            println("Tidak Ada Dalam Menu")
        }
    }

    fun beliMenu(nomorMenu: Int, jumlah: Int): Int? {
        val Pilihan = Menu.keys.toList()
        if (nomorMenu in 1..Pilihan.size) {
            val PilihanMenu = Pilihan[nomorMenu - 1]
            val harga = Menu[PilihanMenu] ?: return null
            return harga * jumlah
        } else {
            println("Menu dengan nomor tersebut tidak ada.")
            return null
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val restoran = Restoran()

    while (true) {
        println("Pilih Operasi:")
        println("1. Lihat Menu")
        println("2. Beli Menu")
        println("3. Keluar")

        print("Masukkan nomor pilihan Anda: ")
        val input = scanner.nextLine()

        try {
            val pilihan = input.toInt()
            when (pilihan) {
                1 -> restoran.lihatMenu()
                2 -> {
                    restoran.lihatMenu()
                    print("Masukkan nomor menu yang ingin dibeli: ")
                    val nomorMenu = scanner.nextInt()
                    scanner.nextLine()
                    print("Masukkan jumlah yang ingin dibeli: ")
                    val jumlah = scanner.nextInt()
                    scanner.nextLine()
                    val total = restoran.beliMenu(nomorMenu, jumlah)
                    if (total != null) {
                        println("Total harga: Rp $total")
                    }
                }
                3 -> {
                    println("Masukkan Pilihan Kode Yang Sesuai")
                    return
                }
                else -> println("Pilihan tidak valid. Silakan pilih lagi.")
            }
        } catch (e: NumberFormatException) {
            println("Masukkan Pilihan Kode Yang Sesuai")
        }
    }
}
