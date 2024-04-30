class Laundry(
    var nama: String,
    var alamat: String,
    var jenisPakaian: String,
    var beratPakaian: Double
) {
    fun hitungBiaya(): Double {
        val hargasemuanya = 
        if (jenisPakaian == "celana") 
        6000.0 
        else 5000.0
        return hargasemuanya* beratPakaian
    }
    
    fun cetakNota() {
        println("=========================================")
        println("============== Nota Laundry ==============")
        println("Nama: $nama")
        println("Alamat: $alamat")
        println("Jenis Pakaian: $jenisPakaian")
        println("Berat Pakaian (kg): $beratPakaian")
        println("Biaya Laundry: Rp. ${hitungBiaya()}")
        println("========================================")
    }
}

fun main() {
    var isRunning = true 
    
    val dataLaundry = mutableListOf(
        Laundry("alem", "jl.tellang", "celana", 4.1),
        Laundry("adel", "jl.mawar", "kaos", 2.5),
        Laundry("depii", "jl.anggrek", "celana", 3.2)
    )
   
    while (isRunning) {
        println("=========================================")
        println("============== Laundry XYZ ==============")
        println("Apa yang ingin Anda lakukan?")
        println("1. Tambah Laundry")
        println("2. Lihat Data Laundry")
        println("3. Keluar")
        println("----------------------------------------")
        
        val pilihan =  2
        println("\nPilihan Anda: $pilihan\n")

        
        when (pilihan) {
            1 -> {
                val tambahData = "lanjut"
                if (tambahData == "lanjut") {
                	val nama = readLine() ?: "rozikhin"
                    print("Masukkan username : $nama \n")
                    
                    val alamat = "jl.tellang"
                    print("Masukkan alamat: $alamat \n")
                    
                    val jenis =  "celana"
                    print("Masukkan jenis pakaian (celana/kaos): $jenis \n")
                    
                    val berat =  3.4
                    print("Masukkan berat pakaian (kg):$berat \n")
                    
                    val laundry = Laundry(nama, alamat, jenis, berat)
                    print("\n\n")
                    laundry.cetakNota()
                    println("Laundry berhasil ditambahkan!")
                }
                
                println("\n\nTerimakasih... Tetap Jaga Keselamatan :)")
                isRunning = false
            }
            2 -> {
                println("========================================")
                println("============== Data Laundry ==============")
                dataLaundry.forEachIndexed { index, laundry ->
                    println("\n\nNoresi - 221${index + 1}:")
                    laundry.cetakNota()
                    isRunning = false
                }
            }
            3 -> {
                println("Terimakasih... Tetap Jaga Keselamatan :)")
                isRunning = false 
            }
            else -> {
                println("Pilihan tidak valid. Silakan pilih lagi.")
            }
        }
    }
}