package oop_00000117132_GlennSebastianSastra.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.25))
    coinRepo.add(Coin("ETH", 10.5))
    coinRepo.add(Coin("USDT", 5000.0))

    val response = ApiResponse(
        "200 OK", coinRepo.getAll()
    )

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")

    response.data.forEach {
        println("Coin: ${it.name} | Balance: ${it.balance}")
    }
}