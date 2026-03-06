package oop_00000117132_GlennSebastianSastra.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil membayar menggunakan credit card!")
        } else {
            println("Transaksi ditolak. Limit credit card $accountName tidak cukup.")
        }
    }
}