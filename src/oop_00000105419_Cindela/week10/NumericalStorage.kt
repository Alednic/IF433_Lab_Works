package oop_00000105419_Cindela.week10

class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}