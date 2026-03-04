package oop_00000105419_Cindela.week05

class MathHelper{
    fun hitungLuas(sisi:Int): Int{
        return sisi*sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}

fun main(){
    val math = MathHelper()
    println("Luas Persegi = ${math.hitungLuas(3)}")
    println("Luas Persegi Panjang = ${math.hitungLuas(4, 3)}")
    println("Luas Lingkaran = ${math.hitungLuas(6.23)}")
}