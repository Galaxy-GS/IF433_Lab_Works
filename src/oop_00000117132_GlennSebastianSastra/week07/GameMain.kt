package oop_00000117132_GlennSebastianSastra.week07

fun main() {
    println("=== GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n === WEAPON SYSTEM ===")
    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}")

    val common = Weapon.forgeStaterWeapon()
    val uncommon = Weapon.forgeUncommonWeapon()
    val rare = Weapon.forgeRareWeapon()
    val epic = Weapon.forgeEpicSword()
    val legendary = Weapon.forgeLegendaryWeapon()
    val secret = Weapon.forgeSecretWeapon()

    val weapons = listOf(common, uncommon, rare, epic, legendary, secret)

    for (weapon in weapons) {
        println("Weapon: ${weapon.item.name}")
        println("Damage: ${weapon.item.damage}")
        println("Rarity: ${weapon.item.rarity}")
        println("Durability: ${weapon.durability}")
        println()
    }
}