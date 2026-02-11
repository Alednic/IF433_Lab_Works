package oop_00000105419_Cindela.week02

import java.util.Scanner

class Loan (
        val bookTitle : String,
        val borrower : String,
        var loanDuration : Int = 1
){
    fun calculateFine(): Int{
        return if (loanDuration > 3) (loanDuration - 3) * 2000 else 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)
    print("Book title: ")
    val bookTitle = scanner.nextLine()
    print("Name: ")
    val borrower = scanner.nextLine()
    print("Duration: ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0){
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)
    println("Book Title: ${loan.bookTitle}")
    println("Peminjam : ${loan.borrower}")
    println("Durasi Peminjaman : ${loan.loanDuration}")
    println("Total Denda: Rp ${loan.calculateFine()}")
}

