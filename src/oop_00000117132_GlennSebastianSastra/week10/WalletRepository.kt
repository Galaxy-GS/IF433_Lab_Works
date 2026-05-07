package oop_00000117132_GlennSebastianSastra.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is NamedEntity && it.name.contains(keyword, true)
        }
    }
}

interface NamedEntity {
    val name: String
}