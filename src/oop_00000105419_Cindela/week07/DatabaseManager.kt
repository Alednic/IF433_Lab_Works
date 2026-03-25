package oop_00000105419_Cindela.week07

object DatabaseManager {
    var connectionStatus:String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to Server"
        println("Database is ready")
    }
}