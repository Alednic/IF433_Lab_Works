package oop_00000105419_Cindela.week07

fun main() {
    println("TEST SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\nTEST COMPANION OBJECT")
    val client = NetworkClient.createClient()
    client.connect()
}