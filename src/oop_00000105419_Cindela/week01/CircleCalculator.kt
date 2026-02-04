package oop_00000105419_Cindela.week01

fun main(args: Array<String>) {
    //variable definition
    val radius = 7.0
    val pi = 3.14

    //calculation
    var area: Double = pi * radius * radius

    println("Radius: $radius , Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if(area > 100){
        println("This is a Big Circle")
    }else {
        println("This is a Small Circle")
    }
}