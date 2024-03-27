fun main() {
    var x = true
	while (x == true) {
        println("==============Ramalan Cuaca=============")
        println("========================================")
        println("Apa yang ingin anda ketahui hari ini?")
        println("1. Cuaca \n2. Kualitas Udara \n3. Gempa Bumi")
        println("----------------------------------------")
        val ramal = ramalan()
        println("[1] Cuaca")
        ramal.cuaca()
        println("========================================")
        println("[2] Kualitas Udara")
        ramal.udara()
        println("========================================")
        println("[3] Gempa Bumi")
        ramal.gempa()
        println("----------------------------------------")
        
        var lihat = "ya"
        if (lihat == "ya"){
            println("YA")
            ramal.detail()
        } else {
            println("TIDAK")
            
        }
        println("========================================")
        println("Terimakasih... Tetap Jaga Keselamatan :)")
        println("========================================")
        x = false
    } 
}

class ramalan() { 
    val kabupaten = "Surabaya : Bandung : Yogyakarta : Bengkulu : Serang"
    var perkiraanCuaca = "  Cerah  : Berawan :    Kabut   :  Berawan : Cerah"
    var kualitasUdara = " Baik : Sedang : Tidak Sehat : Sangat Tidak Baik : Sedang"
    var gempa = "22/03/2024 = 11:22 WIB = Tuban = "
    var mag : Double = 6.0
    
    fun cuaca(){
        println("----------------------------------------")
        println("Cuaca saat ini :")
        println(kabupaten)
        println(perkiraanCuaca)
        println("----------------------------------------")
        println("Lihat ramalan cuaca untuk besok:")
        perkiraanCuaca = "Berawan  : Berawan :   Hujan    :  Cerah   : Cerah"
        println(kabupaten)
        println(perkiraanCuaca)
    }
    
    fun udara(){
        println("----------------------------------------")
        println(">>Analisis Kualitas Udara")
        println(kabupaten)
        println(kualitasUdara)
        println("----------------------------------------")
//         println(">>Prakiraan Kualitas Udara")
    }
    
    fun gempa(){
        println("----------------------------------------")
        print("Informasi Gempa : " + gempa)
        println(mag)
        println("Lihat Update Terbaru Gempa Terkini...")
        
    }
    
    fun detail(){
        println("----------------------------------------")
        println("Informasi Terupdate!!")
        gempa = ("22/03/2024 = 15:52 WIB = Tuban = ")
        print("Informasi Gempa : " + gempa)
        mag += 0.5
        println(mag)
    }
    
}