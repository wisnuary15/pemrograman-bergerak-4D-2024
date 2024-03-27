import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("===========================================")
    println("= SELAMAT DATANG DI RUMAH MAKAN SEDERHANA =")
    println("=    JL. Telang, Kamal, Kab. Bangkalan    =")
    println("===========================================")
    val rm = rumahMakan()
    println("=    Silahkan Login Terlebih Dahulu\t  = \n=\tUntuk Menggunakan Fitur\t\t  =")

    var loginAttempt = 0
    while (loginAttempt < 3) {
        if (rm.login()) {
            println("Login Berhasil. Selamat datang!")
            break
        } else {
            loginAttempt++
            if (loginAttempt < 3) {
                println("Username atau password salah. Silakan coba lagi.")
            } else {
                println("Anda telah melebihi batas percobaan login. Program berhenti.")
                return
            }
        }
    }
    println("===========================================")
    println("=    Pilih Fitur Yang Ingin Di Gunakan    =")
    println("===========================================")
    println("1. Kasir")
    print("Masukkan Pilihan Fitur:")
    val fitur = scanner.nextInt()
    if (fitur == 1) {
        rm.kasir(scanner)
    }
   
}

class rumahMakan() {
    fun login(): Boolean {
        val scanner = Scanner(System.`in`)
        println("===========================================")
        print("Masukkan Username:")
        val username = scanner.nextLine()
        print("Masukkan Password:")
        val password = readPassword()

        return username == "admin" && password == "admin"
    }

    fun readPassword(): String {
        return String(System.console().readPassword())
    }
    
    
    fun kasir(scanner: Scanner) {
        val menus = arrayOf(
            Menu("Nasi Ayam Tiren", 10000),
            Menu("Nasi Ayam Katsu", 10000),
            Menu("Nasi Ayam Cincang", 12000),
            Menu("Nasi Ayam Bakar", 15000),
            Menu("Nasi Ayam Goreng", 12000),
            Menu("Nasi Bebek Goreng", 13000),
            Menu("Nasi Lele Goreng", 11000),
            Menu("Nasi Ayam Geprek", 13000),
            Menu("Nasi Ayam Tumis", 14000)
        )
        var totalPesanan = 0
        val itemDipesan = mutableMapOf<String, Int>()
        println("===========================================")
        println("=             Daftar Menu:                =")
        println("===========================================")
        for (i in menus.indices) {
            println("= ${i + 1}. ${menus[i].name}\t\t-Rp${menus[i].price}  =")
        }
        println("===========================================")
        print("Pilih menu (masukkan nomor menu atau 0 untuk selesai): ")
        var choice = scanner.nextInt()
        while (choice != 0) {
            if (choice in 1..menus.size) {
                val selectedMenu = menus[choice - 1]
                print("Masukkan jumlah pesanan untuk ${selectedMenu.name}: ")
                val quantity = scanner.nextInt()
                if (quantity == 0) {
                    println("Tidak Boleh 0 ")
                } else {
                    // Periksa apakah item sudah ada dalam pesanan
                    if (itemDipesan.containsKey(selectedMenu.name)) {
                        // Jika sudah ada, tambahkan jumlah pesanan
                        itemDipesan[selectedMenu.name] = itemDipesan[selectedMenu.name]!! + quantity
                    } else {
                        // Jika belum ada, tambahkan item baru
                        itemDipesan[selectedMenu.name] = quantity
                    }
                    totalPesanan += selectedMenu.price * quantity
                    println("${selectedMenu.name} (${quantity}x) berhasil ditambahkan ke pesanan Anda.")
                }
            } else {
                println("Menu tidak valid!")
            }
            println("Pilih menu (masukkan nomor menu atau 0 untuk selesai): ")
            choice = scanner.nextInt()
        }

        println("===========================================")
        println("============ STRUK PEMESANAN ==============")
        println("===========================================")
        itemDipesan.forEach { (menu, quantity) -> println("= \t $menu \t (${quantity}x)\t  =") }
        println("===========================================")
        println("= Harus Di Bayar: Rp$totalPesanan\t\t  =")
        println("===========================================")
        println("Masukkan Uang Pelanggan :")
        var uangPembayaran = scanner.nextInt()

        if (uangPembayaran < totalPesanan) {
            println("Uang Tunai Kurang")
            
            while (uangPembayaran < totalPesanan) {
                uangPembayaran = 0
                println("Masukkan Ulang Uang: ")
                val tambahan = scanner.nextInt()
                uangPembayaran += tambahan
                if (uangPembayaran < totalPesanan) {
                    println("Uang masih kurang")
                }
            }
        }

        val kembalian = uangPembayaran - totalPesanan
        println("===========================================")
        println("= Total Di Bayarkan: Rp$uangPembayaran\t\t  =")
        println("= Total Pembayaran: Rp$totalPesanan\t\t  =")
        println("= Kembalian       : Rp$kembalian\t\t  =")
        println("===========================================")
        println("               Martin harra                ")
        println("===========================================")
        println("===========================================")
        println("          Kembali Ke fitur (Y/N)           ")
        println("===========================================")
        var konfirmasi = ""
        while (konfirmasi != "Y" && konfirmasi != "N") {
            konfirmasi = scanner.next()
            if (konfirmasi.equals("Y", ignoreCase = true)) {
                println("1. Kasir ")
                print("Masukkan Pilihan Anda :")
                var konfirmasiFitur = scanner.nextInt()
                if(konfirmasiFitur==1){
                    kasir(scanner)
                }

            } else if (konfirmasi.equals("N", ignoreCase = true)) {
                println("Terima kasih telah menggunakan layanan kami.")
                return
            } else {
                println("Masukkan Y atau N")
            }
        }
    }

    
}
               

class Menu(val name: String, val price: Int)
