class Menu(val nama: String, val harga: Int)
	
	class Toko(val nama: String, val sepatu: List<Menu>) {
	
	    fun tampilanMenu() {
	        println("Selamat datang di $nama")
	        println("Sepatu yang tersedia :")
	        sepatu.forEachIndexed { index, menu ->
	            println("${index + 1}. ${menu.nama} - Rp${menu.harga}")
	        }
	    }
	
	    // Function untuk memesan sepatu
	    fun pesanSepatu(menuIndex: Int): Menu? {
	        if (menuIndex in 1..sepatu.size) {
	            return sepatu[menuIndex - 1]
	        }
	        return null
	    }
	
	  
    }
	fun main() {
	    // Inisialisasi menu-menu toko sepatu
	    val sepatu = listOf(
	        Menu("Nike Air Max", 1500000),
	        Menu("Nike Court Vision", 1200000),
	        Menu("Nike Air Force", 2300000),
	        Menu("Nike Air Jordan", 4100000),
	        Menu("Nike Legend essential", 1800000)
	    )
	
	    // Inisialisasi Toko
	    val toko = Toko("Toko Sepatu Jawir", sepatu)
	
	    // Menampilkan Menu
	    toko.tampilanMenu()

	
	    // Memesan makanan
	    val menuIndex = 3
	    val pesanan = toko.pesanSepatu(menuIndex)
	
	    if (pesanan != null) {
	        println("Anda telah memesan ${pesanan.nama}. Silakan menunggu.")
	  
	    } else {
	        println("Sepatu tidak tersedia.")
	 
    }	}