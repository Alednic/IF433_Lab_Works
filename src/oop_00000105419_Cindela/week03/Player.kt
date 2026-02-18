package oop_00000105419_Cindela.week03

class Player (
    val username: String
){
    private var xp: Int = 0

    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level
            xp += amount
            println("$username dapat $amount XP.")

            if (level > oldLevel) {
                println("Level Up! $username naik level $level.")
            }
        } else {
            println("ERROR: XP yang didapat harus positif!")
        }
    }
}

fun main(){
        val player1 = Player("Jay")

        //player1.xp = 500 //error

        player1.addXp(50)
        player1.addXp(60)
}