package oop_00000105419_Cindela.week11

//function biasa
fun salam_pembuka(nama: String){
    if(nama=="budi gunawan"){
        println("Salam Kenal")
    }
}

//function extension
fun String.rubah_huruf_depan_jadi_besar():String{
    var hasil = this.split(" ").joinToString(" "){
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return "Hai $hasil"
}

fun main(){
    var namaSaya = "budi gunawan"
    salam_pembuka(namaSaya)
    println(namaSaya.uppercase());

    //cara panggil function extension
    println("udin sedunia kjdjahduefha kjdkahudwa".rubah_huruf_depan_jadi_besar())
}