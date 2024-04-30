fun main() {
    println("SELAMAT DATANG DI ARZA GAME!")
    println("!! Pemberitahuan !!")
    println("Hitungan Main/Jam = 5.000 \nDengan max bermain 5 jam\n")
    println("==Hanya Terdapat 2 Meja==\n")
    
    val lamaMain = DurasiPS()
    println("================================================================================")
    lamaMain.Playstation()
    println("--------------------------------------------------------------------------------")
}

class DurasiPS {
    var jam = 1
    var Ps1 = 4
    var Ps2 = 2
    var biaya = 5000
    var totalBermain = 4 
    
    fun Playstation() {  
        for (i in 1..totalBermain) {
            println("=== Permainan ke-$i ===")
            if (Ps1 < 5) {
                val totalHarga1 = jam * biaya * Ps1
                println("==> Meja 1 Bermain $Ps1 JAM : Rp $totalHarga1")
                
            } else{
                println("Maaf untuk PS1 durasi yang diminta melebihi kapasitas. Max durasi adalah 5 jam.")
            }
            
            if (Ps2 < 5){
                val totalHarga2 = jam * biaya * Ps2
                 println("==> Meja 2 Bermain $Ps2 JAM : Rp $totalHarga2")
                 
            } else{
                println("Maaf untuk PS2, durasi yang diminta melibihi kapasitas. Max durasi adalah 5 jam.")
                
            }
        }
    }
}