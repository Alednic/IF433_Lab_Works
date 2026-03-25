package oop_00000105419_Cindela.week07

fun processEvent(event: BattleState) {
    when (event) {
        is SafeZone -> println("Zona Aman. Harap beristirahat.")
        is MonsterEncounter -> println("Waspada! Monster ${event.monsterName} muncul!")
        is LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Loot ditemukan: $name | Damage: $dmg | Rarity: $rarity")
        }
        is GameOver -> println("Permainan Berakhir: ${event.reason}")
    }
}