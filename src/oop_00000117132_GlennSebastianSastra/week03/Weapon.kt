package oop_00000117132_GlennSebastianSastra.week03

class Weapon(val name: String, damage: Int) {
    var damage: Int = damage
        set(value) {
            when {
                value > 0 -> {
                    println("Damage tidak boleh negatif!")
                }
                value < 1000 -> {
                    println("Damage terlalu overpower!")
                    field = 1000
                }
                else -> field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "common"
        }
}