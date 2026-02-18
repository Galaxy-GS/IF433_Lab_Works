package oop_00000117132_GlennSebastianSastra.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== SteamKW Receipt ===")
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}