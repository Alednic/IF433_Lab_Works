package oop_00000105419_Cindela.week06

class Karyawan(
    override val namaKerjaan:String,
    override val gaji: Int,
    override val jmlHari: Int
):Bekerja{
    override fun ngoding() {
        println("Kerjaan kamu $namaKerjaan")
        println("Gaji kamu ${super.GajiDidapat}")
    }
}