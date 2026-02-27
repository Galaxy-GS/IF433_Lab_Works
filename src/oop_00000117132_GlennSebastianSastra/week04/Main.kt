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

    println("\n--- Testing Employee ---")
    println("\n\nGeneral Employee")
    val generalEmployee = Employee(name = "Evan", baseSalary = 4000000)
    generalEmployee.work()
    println("Bonus ${generalEmployee.name}: ${generalEmployee.calculateBonus()} ")

    println("\nManager")
    val companyManager = Manager(name = "Bryant", baseSalary = 15000000)
    companyManager.work()
    println("Bonus ${companyManager.name}: ${companyManager.calculateBonus()} ")

    println("\nDeveloper")
    val companyDeveloper = Developer(name = "Glenn", baseSalary = 30000000, programmingLanguage = "kotlin")
    companyDeveloper.work()
    println("Bonus ${companyDeveloper.name}: ${companyDeveloper.calculateBonus()} ")
}