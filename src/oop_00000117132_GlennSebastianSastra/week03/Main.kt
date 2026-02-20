package oop_00000117132_GlennSebastianSastra.week03

fun main() {
    println("--- Test Employee ---")
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n--- Test Weapon ---")
    val weapon = Weapon("Blade of Despair", 950)

    weapon.damage = -10

    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}