fun main() {
    var x = true
	while (x == true) {
        println("==============Penginapan Villa=============")
        println("==========================================")
        println("Informasi apa yang ingin Anda ketahui?")
        println("1. Lihat Daftar Villa \n2. Sewa Villa \n3. Lihat Status Sewa \nPilih nomor berapa? 1/2/3")
        println("========================================== \n")
        println("----------------------------------------")
        val penginapan = Penginapan()
        println("[1] Daftar Villa")
        penginapan.daftar()
        println("========================================")
        println("[2] Sewa Villa")
        penginapan.sewa()
        println("========================================")
        println("[3] Lihat Status Sewa")
        penginapan.status()
        println("========================================")
        println("[4] Metode Pembayaran")
        penginapan.status()
        println("----------------------------------------")
        
        var kondisi = "ya"
        if (kondisi == "ya"){
            println("YES")
        } else {
            println("NO")
            penginapan.keterangan()
        }
        println("========================================")
        println("Nikmati liburan Anda di villa kami :)")
        println("========================================")
        x = false
    } 
}

class Penginapan() { 
    val villaType = arrayOf("Villa Tipe 1", "Villa Tipe 2", "Villa Tipe 3", "Villa Tipe 4")
    val kapasitas = arrayOf("12 Orang", "8 Orang", "6 Orang", "10 Orang")
    val jumlah = arrayOf("5 Unit", "3 Unit", "4 Unit", "6 Unit")
    val tersedia = arrayOf("2 Unit", "1 Unit", "2 Unit", "4 Unit")
    val tersewa = arrayOf("3 Unit", "2 Unit", "2 Unit", "2 Unit")
    
    fun daftar(){
        println("----------------------------------------")
        println("Tipe Villa          Kapasitas Penghuni")
        println("----------------------------------------")
        for (i in villaType.indices) {
            println("${i + 1}. ${villaType[i]} : ${kapasitas[i]}")
        }
        println("----------------------------------------")
    }
    
    fun sewa(){
        println("----------------------------------------")
        println("Tipe Villa          Jumlah Villa yang Tersedia")
        println("----------------------------------------")
        for (i in villaType.indices) {
            println("${i + 1}. ${villaType[i]} : ${jumlah[i]}")
        }
        println("----------------------------------------")
    }
    
    fun status(){
        println("----------------------------------------")
        println("Tipe Villa          Tersedia     Tersewa")
        println("----------------------------------------")
        for (i in villaType.indices) {
            println("${villaType[i]} : ${tersedia[i]} : ${tersewa[i]}")
        }
        println("----------------------------------------")
    }
    
    fun keterangan(){
        println("----------------------------------------")
        println("Nikmati Kesempurnaan Liburan Anda Bersama Kami")

        
    }   
}