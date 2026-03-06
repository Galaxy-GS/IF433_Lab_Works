package oop_00000117132_GlennSebastianSastra.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}