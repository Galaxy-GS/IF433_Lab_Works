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

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 150000.0))
    txRepo.add(Transaction("TX002", 275000.0))
    println("\n=== TRANSACTIONS ===")

    txRepo.getAll().forEach {
        println("Transaction ${it.id} | Amount: ${it.amount}")
    }
} //jalan sesuai yang diharapkan