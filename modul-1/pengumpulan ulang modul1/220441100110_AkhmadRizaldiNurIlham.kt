class Product(val name: String, val harga: Double, val stock: Int) {
    fun displayInfo() {
        println("Product: $name | Harga: Rp$harga | Stock: $stock")
    }
}

fun welcomeMessage() {
    println("Selamat datang Di Zall.os Store")
    
    println("|---------------------------------|")
}

fun main() {
    // Variabel produk
    val product1 = Product("T-Shirt", 100000.0, 10)
    val product2 = Product("Shoes", 250000.0, 5)


    welcomeMessage()
    println("Macam Produk:")
    println("-----------------------------------------------------|")
    product1.displayInfo()
    product2.displayInfo()
    println("-----------------------------------------------------|")

 
    var barang = 8

    // Jika jumlah produk yang akan dibeli kurang dari atau sama dengan stok
    if (barang <= product1.stock) {
        println("kamu membeli $barang ${product1.name}(s)")
    } else {
        println("MAAFFF, ${product1.name} STOK HABISS...")
    }

    var totalHarga = 0.0
    for (i in 1..barang) {
        totalHarga += product1.harga
    }
    println("|--------------------------")
    println("| Total Harga : Rp$totalHarga |")
    println("|--------------------------")

    // Class untuk  data pembeli
    class Customer(val name: String, val address: String) {
        fun displayInfo() {
            println("Customer: $name | Alamat: $address")
        }
    }

    val customer = Customer("John", "Dari JKT") 
    customer.displayInfo()
}