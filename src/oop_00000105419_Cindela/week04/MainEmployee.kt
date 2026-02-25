package oop_00000105419_Cindela.week04

fun main() {
    val manager = Manager("Jay", 10000000)
    val dev = Developer("Cindela", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    dev.work()
    println("Bonus Developer: ${dev.calculateBonus()}")
}