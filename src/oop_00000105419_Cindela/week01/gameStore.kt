package oop_00000105419_Cindela.week01

fun main(){
    val gameTitle: String = "SteamKW"
    val price: Int = 550000
}

fun calculateDiscount(price: Int): Int = if (price > 500000) {
    price * 80/100
} else {
    price * 90/100
}