package oop_00000117132_GlennSebastianSastra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val damage = scanner.nextLine().toInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextLine().toInt()

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Hero kabur dari pertempuran!")
            break
        }
    }

    println("=== HASIL PERTEMPURAN ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("Hero menang!")
    } else if (!hero.isAlive()) {
        println("Hero kalah!")
    }
}