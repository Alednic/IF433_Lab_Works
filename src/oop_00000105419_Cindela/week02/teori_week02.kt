package oop_00000105419_Cindela.week02

class Jagoan {
    var nama:String = "unknown"
    var hp:Int = 100

    init{
        print("Halo saya constructor")
        this.nama="Udin"
        this.hp = 120
    }

    constructor(darahhero:Int = 200){
        println("Ini constructor kedua!")
        this.hp = darahhero
    }

    fun jalan(){
        //codingan untuk jalan
        println("Hero $nama jalan kaki ke pasar")
    }

    fun serang(){
        println("Hero serang dengan life: $hp")
    }
}

fun main() {
    val hero = Jagoan(darahhero = 250) //object namavariable
    println("Hero $hero.nama")
    println("Darah Hero: ${hero.hp}")
    hero.nama = "Jay"
    println("Nama Hero adalah ${hero.nama}")
    hero.jalan()
    hero.serang()
}