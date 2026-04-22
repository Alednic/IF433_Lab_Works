package oop_00000105419_Cindela.week09

fun main(){
    val arSiswa = listOf("Ali", "Budi", "Cica")
    //view array list
    println(arSiswa)
    //muncullin satu item saja
    println(arSiswa[1])
    //menghitung banyak item
    println("Banyak siswa ="+ arSiswa.size)
    //munculin semua item
    for(i in arSiswa){
        println(i)
    }

    println("\n==========LIST OF MUTABLE==========")
    val arMatkul = mutableListOf("OOP", "Matdis", "GameDev")
    arMatkul.add("Kalkulus")
    arMatkul[2] = "Pemweb"
    arMatkul.remove("Matdis")
    println(arMatkul)


    //SET OF menghilangkan yang double
    println("\n\n==========SET OF IMUTABLE==========")
    val arNilai = setOf(80, 90, 20, 40, 30, 20, 10, 100, 90)
    println("banyak data : ${arNilai.size}")
    println("Angka 20 ada gak? ${arNilai.contains(20)}")
    println(arNilai)

    println("\n==========SET OF MUTABLE==========")
    var arMakanan = mutableSetOf("Nasi Goreng", "Tempe","Bakpao", "Tahu", "Ayam", "Bakpao")
    arMakanan.add("Mie")
    arMakanan.remove("Bakpao")
    arMakanan.add("Tempe")
    println(arMakanan)

    //MAP OF
    println("\n\n==========MAP OF IMUTABLE==========")
    var arDataMhs = mapOf(
        "Acong" to 89,
        "Siska" to 90,
        "Udin" to 85
    )
    println("Banyak data: ${arDataMhs.size}")
    println("Si Acong nilainya: ${arDataMhs["Acong"]}")
    println("List semua Mahasiswa: ${arDataMhs.keys}")
    println("List semua Nilai: ${arDataMhs.values}")
    println(arDataMhs)

    println("\n==========MAP OF MUTABLE==========")
    var arMenuResto = mutableMapOf(
        "Mie Ayam" to 5000,
        "Mie Bakso" to 6000,
        "Mie Pangsit" to 6500
    )
    arMenuResto["Mie Bakso"] = 6500
    arMenuResto.remove("Mie Ayam")
    println(arMenuResto)

    //lambda
    println("\n\n==========LAMBDA==========")
    //cara lama -> function tulis dibawah
    fun tambah(a:Int, b:Int):Int{
        return a+b
    }
    println("Hasil tambah: ${tambah(20, 3)}")

    //cara baru ->tulis disamping
    var kurang = {a: Int, b: Int -> a-b}
    println("Hasil: ${kurang(10,3)}")

    print("\n\n==========LAMBDA (IT)==========")
    val pangkat = {a: Int -> a*a}
    val hitungPangkat:(Int) -> Int = {it*it}
    println("\nHasil pangkat: ${hitungPangkat(5)}")

}