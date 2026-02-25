package oop_00000105419_Cindela.week04

fun main() {
    println("Testing Vehicle")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\nTesting Car")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\nTesting Electric Car")
    val myTesla = ElectricCar("Tesla", 4, 85)
    myTesla.accelerate()
    myTesla.honk()
    myTesla.openTrunk()
}