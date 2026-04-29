package oop_00000105419_Cindela.week10

//Non-generic programming
class meja(val hasil:Any)

//Generic programming
class kursi<T>(val hasil: T)

//Generic multiple paramater
class Televisi<T, V>(val merk:T, val kodeBarcode:V)

//generic - function
fun <T> Alamat(kodepos:  T): T{
    return kodepos
}

//generic - constraint
class kalkulator<T: Number>(val a: T, val b:T){
    fun tambah(): Int{
        return a.toInt() +b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble()-b.toDouble()
    }
}

//generic -  WHERE
val arNilai = listOf(60, 70, 85, 75, 63, 80, 92, 76, 46, 50, 71)
fun <T>nilaidiatasKKM(list : List<T>, kkm:T): List<T> where T: Comparable<T> {
    return list.filter { it >= kkm }
}


fun main(){
    println("=========implementasi Non-Generic=========")
    val mj = meja(100)
    // harus casting dl sebagai Int
    val hargaMeja = mj.hasil as Int
    println(mj.hasil + 50)

    println("=========implementasi Generic==========")
    val chair = kursi(300)
    println(chair.hasil + 50)

    println("=========implementasi generic multiple param=======")
    val tv = Televisi("Samsung", 884477)
    println("Merknya " + tv.merk)
    println("Barcode ${tv.kodeBarcode + 100}")

    println("========implementasi generic function==========")
    println("Kode pos kamu " + Alamat(154133))

    println("============implementasi generic kalkulator==========")
    val kal = kalkulator(10.5, 20.43)
    println("Hasil penambahan: ${kal.a} ditambah ${kal.b} : "+ kal.tambah())
    println("Hasil pengurangan: ${kal.a} dikurang ${kal.b} : "+ kal.kurang())

    println("============implementasi generic - where===============")
    println("Semua nilai = " + arNilai)
    var nilaiKKM = nilaidiatasKKM(arNilai, 70)
    println("Nilai diatas KKM = " + nilaiKKM)

}
