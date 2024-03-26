class menutiketkereta(val nama: String, val harga: Int)
class kai(val nama: String, val menu: List<menutiketkereta>){
        fun tampilanMenu() {
        println("Selamat datang di $nama")
        println("Tiket yang tersedia :")
        menu.forEachIndexed { index, menu ->
            println("${index + 1}. ${menu.nama} - Rp${menu.harga}")
        }
}
}

fun main() {
   val menu = listOf(
        menutiketkereta("Airlangga",104000),
        menutiketkereta("Sembrani",700000),
        menutiketkereta("Pandalungan",500000),
    )
   

   val KAI = kai("KAI Acces", menu)
   KAI.tampilanMenu()
   var x = true
   while (x == true){
        val pilihanMenu = 4 // Pilihan menu yang sudah ditentukan

    if (pilihanMenu in 1..menu.size) {
        val selectedMenu = menu[pilihanMenu - 1]
        println("Anda telah memilih menu ${selectedMenu.nama} - ${selectedMenu.harga}  ")
  
    } else {
        println("Pilihan menu tidak valid.")
    }   

    println("Ingin memilih lagi ??")
 	var kondisi = "ya"
        if (kondisi != "ya"){
            println("YES")
        } else {
            println("NO")
        }
        println("========================================")
        println("Nikmati perjalanan anda :)")
        println("========================================")
        x = false
    }  
       
   } 
