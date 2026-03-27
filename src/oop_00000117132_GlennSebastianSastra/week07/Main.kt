package oop_00000117132_GlennSebastianSastra.week07

import oop_00000117132_GlennSebastianSastra.week07.NetworkClient.Companion.createClient

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}