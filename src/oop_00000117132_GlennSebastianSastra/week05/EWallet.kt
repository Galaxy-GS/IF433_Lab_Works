package oop_00000117132_GlennSebastianSastra.week05

class EWallet(accountName: String,var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double){
        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar menggunakan EWallet!")
        } else {
            println("$accountName tidak memiliki saldo yang cukup.")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("$accountName berhasil top up sebesar $amount")
    }
}