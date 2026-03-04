package oop_00000105419_Cindela.week05

abstract class Karyawan{
    val nama: String = "Budi"

    abstract fun bekerja (kecepatan: Int):String

    fun terima_gaji(){
        print("hore gajian!!!")
    }
}

class Staff:Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return "Staff ngetik, kecepatan $kecepatan"
    }
}

class Manager: Karyawan(){
    override fun bekerja(kecepatan: Int): String {
        return "Manager mengawasi $kecepatan km/jam"
    }
}

fun main() {
    val staf = Staff()
    println("Staff kerja: ${staf.bekerja(7)}")

    val mgr = Manager()
    println("Manager kerja: ${mgr.bekerja(12)}")
}