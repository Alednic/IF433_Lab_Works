package oop_00000105419_Cindela.week01

fun main(){
    val gameTitle: String = "Black Myth Wukong"
    val price: Int = 550000
    val discountedPrice = calculateDiscount(price)
    printReceipt(title=gameTitle, finalPrice=discountedPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price * 80/100
} else {
    price * 90/100
}

fun printReceipt(title: String, finalPrice: Int) {
    println("-Struk Pembelian-")
    println("Judul Game: $title")
    println("Total Bayar: $finalPrice")
    println()
}