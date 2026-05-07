package oop_00000117132_GlennSebastianSastra.week10

data class Coin(override val name:String, val balance: Double) : NamedEntity

data class Transaction(val id: String, val amount: Double)