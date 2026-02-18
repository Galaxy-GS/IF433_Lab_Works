package oop_00000117132_GlennSebastianSastra.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val finalPrice = calculateDiscount(price)

    println("Harga akhir: Rp $finalPrice")
}

fun calculateDiscount(price: Int) =
    if (price > 500000) price * 80 / 100
    else price * 90 / 100