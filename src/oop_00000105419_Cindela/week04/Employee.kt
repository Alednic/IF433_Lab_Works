package oop_00000105419_Cindela.week04

open class Employee(name: String, baseSalary: Int) {
    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int = (baseSalary * 0.1).toInt()
}