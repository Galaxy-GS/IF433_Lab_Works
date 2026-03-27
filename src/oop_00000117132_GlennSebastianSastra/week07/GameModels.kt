package oop_00000117132_GlennSebastianSastra.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(50), RARE(25), EPIC(15), LEGENDARY(5), SECRET(1)
}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity)