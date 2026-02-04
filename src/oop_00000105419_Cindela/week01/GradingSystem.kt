package oop_00000105419_Cindela.week01

fun main(){
    // REFACTOR: menggunakan val dan hapus tipe data eksplisit
    val name = "John Thor"
    val score = 80

    //REFACTOR: String Template($name)
    println("Nama: $name, Nilai: $score")
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null

    //Jika null, gunakan nilai default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}

fun calculateStatus(score: Int) = if(score>75) "Lulus" else "Tidak Lulus"
