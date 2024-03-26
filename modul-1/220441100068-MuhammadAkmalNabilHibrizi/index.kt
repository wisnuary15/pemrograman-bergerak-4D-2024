fun main() {
    var x = true
	while (x == true) {
        println("==============Penyewaan Kendaraan=============")
        println("==============================================")
        println("Informasi apa yang ingin anda jangkau ?")
        println("1. Lihat Daftar Kedaraan \n2. Ketersediaan Kendaraan \n3. Harga Sewa Kendaraan \n4. Lihat Status Sewa \nKamu mau pilih nomer berapa ? 1/2/3/4")
        println("============================================== \n")
        println("----------------------------------------")
        val rental = Rental()
        println("[1] Daftar Kendaraan")
        rental.daftar()
        println("========================================")
        println("[2] Ketersediaan Kendaraan")
        rental.ketersediaan()
        println("========================================")
        println("[3] Harga Sewa Kendaraan")
        rental.harga()
        println("========================================")
        println("[4] Lihat Status Sewa")
        rental.status()
        println("----------------------------------------")
       
        
        var kondisi = "ya"
        if (kondisi != "ya"){
            println("YES")
        } else {
            println("NO")
            rental.keterangan()
            
        }
        println("========================================")
        println("Nikmati perjalanan anda :)")
        println("========================================")
        x = false
    } 
}

class Rental() { 
    val kendaraan = " Bus : Mobil : Motor : Sepeda"
    var kapasitas = " 60  :   8   :   2   :   2  "
    var jumlah =    " 10  :   15  :   20  :   15 "
    var tersedia =  "  5  :   5   :   10  :   5  "
    var tersewa =   "  5  :   10  :   10  :  10  "
    var harga1 = "5.000.000/hari"
    var harga2 = "1.000.000/hari"
    var harga3 = "75.000/hari"
    var harga4 = "40.000/hari"
    var hari : Double = 24.2 
    
    fun daftar(){
        println("----------------------------------------")
        println("Kapasistas Penumpang Kendaran :")
        println(kendaraan)
        println(kapasitas)
        println("----------------------------------------")

    }
    
    fun ketersediaan(){
        println("----------------------------------------")
        println("Jumlah kendaraan yang tersedia dikami :")
        println(kendaraan)
        println(jumlah)
    }
    
    fun harga(){
        println("----------------------------------------")
        println("Harga Sewa Perhari :")
        println("Bus    :" + harga1)
        println("Mobil  :" + harga2)
        println("Motor  :" + harga3)
        println("Sepeda :" + harga4)
        println("----------------------------------------")

    }
    
    fun status(){
        println("--------------------" + kendaraan +"----")
        print("Informasi tersedia: " + tersedia + "\n")
        print("Informasi tersewa : " + tersewa + "\n")
        
        
    }
    
    fun keterangan(){
        println("----------------------------------------")
        println("Gunakan Kendaraan Yang Nyaman Bersama Kami")
        tersewa = ("SEDIA SETIAP HARI = ")
        print("JASA SEWAKEN : " + tersewa)
        hari += 0.5
        println(hari)
    }
    
}