package oop_00000117132_GlennSebastianSastra.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val  myEV = ElectricCar(brand = "BYD", numberOfDoors = 4, batteryCapacity = 82)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()
}