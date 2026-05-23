package oop_00000105419_Cindela.week13

import java.io.File

fun main(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisisiasi sistem.\n")
    println("FIle berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")
}