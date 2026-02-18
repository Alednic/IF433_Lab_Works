class Weapon(
    val name: String,
){
    var damage: Int = 0
        set(value) {
            if(value<0){
                println("damage must not be minus!")
            }else if(value>=1000){
                println("You are too overpowered!")
                field = 1000
            }else{
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}