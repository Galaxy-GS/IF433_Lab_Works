package oop_00000117132_GlennSebastianSastra.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter ->
            println("Sedang Farming ${event.monsterName}")

        is BattleState.LootDropped ->
            println("Mendapat item ${event.item.name} (${event.item.rarity})")

        is BattleState.GameOver ->
            println("Game Over: ${event.reason}")

        BattleState.SafeZone ->
            println("Berada di fountain base.")
    }
}