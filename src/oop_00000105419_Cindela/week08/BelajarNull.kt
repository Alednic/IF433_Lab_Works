package oop_00000105419_Cindela.week08

class set_krs(val nim:String, val tahun:Int?){
    fun pilih_matkul(kodeMatkul:String?){
        println("Matkul dipilih: $kodeMatkul")
    }
}
fun main(){
    var nama: String? = "cinde"
    nama = null
    println("hai $nama")

    val setKRS = set_krs(nim ="0001234", tahun =null)
    println("si ${setKRS.nim}, masuk tahun ${setKRS.tahun}")
    setKRS.pilih_matkul(null)
}