package oop_00000105419_Cindela.week12

fun basic_trycatch(pembilang:Int, penyebut:Int){
    try{
        val hasil = pembilang/penyebut
        println("Hasil bagi $hasil")
    }catch(ex:Exception){
        println("Ada error pembagian ${ex.message}")
    }finally{
        println("Selesai pembagian")
    }
}

fun cek_tipe_data(angka: String){
    var nilai:Int = try {
        Integer.parseInt(angka)
    }catch (e: Exception){
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("Nilai kamu: $nilai")
}

fun cek_gaji(hariKerja: Int){
    if(hariKerja < 0){
        throw IllegalArgumentException("Masa Hari kerja minus")
    }else{
        val gaji = hariKerja * 100
        println("Gaji kamu: $gaji")
    }
}

fun main(){
    //coba throw
    try {
        cek_gaji(-1)
    } catch (e: Exception) {
        println("Error coba catch ::: ${e.message}")
    }

    //exception - expression
    cek_tipe_data(angka = "abc")

    //basic exception
    basic_trycatch(10,0)
}