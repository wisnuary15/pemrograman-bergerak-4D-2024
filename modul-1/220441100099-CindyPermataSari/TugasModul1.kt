/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
	var ulang = true
    while (ulang) {
        val anggota = koperasi()
        println("==============================================================")
        println("Date : 12/04/2024")
        anggota.menu()
        println("==============================================================")
        println("Pilih : 1")
        println("==============================================================")
        println("------------------------Cek Keaggotaan------------------------")
        println("==============================================================")
		anggota.keanggotaan()
        println("==============================================================")
        println("Pilih : 2")
        println("==============================================================")
        println("------------------------Cek Tabungan--------------------------")
        println("==============================================================")
        anggota.tabungan()
        println("==============================================================")
        println("Pilih : 3")
        println("==============================================================")
        println("-------------------------Peminjaman---------------------------")
        println("==============================================================")
        anggota.pinjam()
        println("==============================================================")
        println("Pilih : 4")
        println("==============================================================")
        println("--------------------------Angsuran----------------------------")
        println("==============================================================")
        anggota.angsuran()
        println("==============================================================")

        println("Apakah anda ingin keluar dari aplikasi?  YES")
        
        val x = "tidak"
        if(x == "yes"){
            ulang = true
        } else {
            println("Terima Kasih...")
        ulang = false
        }
        
    }
}

class koperasi(){
    val nomorKeanggotaan: Long = 220441100099
    val nama = "Cindy Permata Sari"
    val hp: Long = 6285646130511
    val alamat = "Pacet, Mojokerto, Jawa Timur"
    var saldoTabungan = 500000
    var jumlahPinjaman = 200000
    var jumlahAngsuran = 50000
   
    
    fun menu(){
        println("==============================================================")
        println("                 Selamat Datang Anggota")
        println("               KOPERASI SIMPAN PINJAM KITA")
        println("==============================================================")
        println("1. Cek Keanggotaan\n2. Simpan \n3. Pinjam \n4. Angsuran")
    }
    fun keanggotaan(){
        println("NO Keanggotaan  : " + nomorKeanggotaan)
        println("Nama Anggota    : " + nama)
        println("Nomor Handphone : " + hp)
        println("Alamat          : " + alamat)
        println("Status Anggota  : Aktif")
    }
    
    fun tabungan(){
        println("NO Keanggotaan : " + nomorKeanggotaan)
        println("Nama Anggota   : " + nama)
        println("Saldo Tabungan : " + saldoTabungan)
    }
    
    fun pinjam(){
        println("No Peminjaman      : 202401")
        println("NO Keanggotaan     : " + nomorKeanggotaan)
        println("Nama Anggota       : " + nama)
        println("Besar Peminjaman   : " + jumlahPinjaman)
        println("Tanggal Peminjaman : 12 Februari 2024")
        println("Batas Pelunasan    : 12 Desember 2024")
    }
    
    fun angsuran(){
        
        println("No Angsuran        : 202412")
        println("No Peminjaman      : 202401")
        println("NO Keanggotaan     : " + nomorKeanggotaan)
        println("Nama Anggota       : " + nama)
        println("Keterangan         : Angsuran Ke-2")
        println("Besar Angsuran     : " + jumlahAngsuran)
        jumlahAngsuran += 50000
        val sisaAngsuran = jumlahPinjaman - jumlahAngsuran
        println("Sisa Pinjaman      : " + sisaAngsuran)
        println("Tamggal Angsuran   : 12 April 2024")
    }
    
      
    
}