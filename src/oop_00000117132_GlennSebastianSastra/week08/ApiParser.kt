package oop_00000117132_GlennSebastianSastra.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API INVALID: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API INVALID: Missing name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "Electronic" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "Clothing" -> {
                val size = rawJson["size"] as? String ?: "All size"
                Product.Clothing(id, name, size)
            }
            else -> null

        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }
        val trxId = JavaPaymentService.processPayment(id)!!
        println("Transaction ID: $trxId")
    }
}