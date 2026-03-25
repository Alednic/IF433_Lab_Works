package oop_00000105419_Cindela.week07

fun main() {
    println("TEST SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\nTEST COMPANION OBJECT")
    val client = NetworkClient.createClient()
    client.connect()

    println("\nTEST REGULAR CLASS")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}