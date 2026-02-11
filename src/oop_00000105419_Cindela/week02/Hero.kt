package oop_00000105419_Cindela.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
){
    fun attack(targetName: String){
        println("$name menembak $targetName")
    }
    fun takeDamage(damage: Int){
        hp -= damage
        if (hp < 0) hp = 0
    }
    fun isAlive(): Boolean = hp > 0
}

fun main(){
    val scanner = Scanner(System.`in`)
    print("Nama: ")
    val heroName = scanner.nextLine()
    print("Damage Hero: ")
    val damage = scanner.nextInt()
    val hero = Hero(heroName, damage, )
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("HP Hero: ${hero.hp} --------- HP Musuh: $enemyHp")
        print("1. Serang, 2. Kabur: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Monster")
            enemyHp -= hero.baseDamage
            println("HP Hero: ${hero.hp} --------- HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val monsterDamage = (10..20).random()
                hero.takeDamage(monsterDamage)
                println("Monster menyerang balik! Hero terkena $monsterDamage damage.")
                println("HP Hero: ${hero.hp} --------- HP Musuh: $enemyHp")
            }
        } else break
    }

    if (enemyHp <= 0) println("Horeey!") else println("GAME OVER...")
}