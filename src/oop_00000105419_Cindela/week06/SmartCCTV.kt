package oop_00000105419_Cindela.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnon() {
        println("$name CCTV Aktif.")
        startRecord()
    }
    override fun turnoff() { println("$name CCTV Nonaktif.") }
    override fun startRecord() { println("$name Memulai perekaman video...") }
}