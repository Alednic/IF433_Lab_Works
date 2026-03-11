package oop_00000105419_Cindela.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("$name Lampu dinyalakan.") }
    override fun turnoff() { println("$name Lampu dimatikan.") }
}