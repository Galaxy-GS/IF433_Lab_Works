package oop_00000117132_GlennSebastianSastra.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStaterWeapon() : Weapon{
            return Weapon(
                GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50
            )
        }

        fun forgeUncommonWeapon() : Weapon{
            return Weapon(
                GameItem("Dagger", 15, ItemRarity.UNCOMMON), 70
            )
        }

        fun forgeRareWeapon() : Weapon{
            return Weapon(
                GameItem("Fury Hammer", 35, ItemRarity.RARE), 100
            )
        }

        fun forgeEpicSword() : Weapon{
            return Weapon(
                GameItem("Hunter Strike", 80, ItemRarity.EPIC), 200
            )
        }

        fun forgeLegendaryWeapon() : Weapon{
            return Weapon(
                GameItem("Blade of Despair", 160, ItemRarity.LEGENDARY), 300
            )
        }

        fun forgeSecretWeapon() : Weapon{
            return Weapon(
                GameItem("Zangetsu", 1000, ItemRarity.SECRET), 1
            )
        }
    }
}