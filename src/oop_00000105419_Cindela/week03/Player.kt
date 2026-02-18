package oop_00000105419_Cindela.week03

class Player (
    val username: String
){
    private var xp: Int = 0
    var level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            println("$username mendapatkan $amount XP.")

            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level.")
            }
        } else {
            println("ERROR: XP yang didapat harus positif!")
        }
    }
}