package oop_00000117132_GlennSebastianSastra.week14
import oop_00000117132_GlennSebastianSastra.week08.Order
import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
         }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(data: String)
}

class CsvOrderRepository(private val path: String) : OrderRepository {
    override fun saveOrder(data: String) {
        File(path).printWriter().use { writer ->
            writer.println(data)
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("EMAIL: $message")
    }
}

class SafeOrderProcessor(private val repo: OrderRepository, private val notifier: NotificationService) {
    fun processOrder(customerType: String, price: Double) {
        val finalPrice = when (customerType) {
            "VIP" -> price * 0.8
            else -> price
        }

        repo.saveOrder("$customerType,$finalPrice")

        notifier.sendNotification("Order berhasil diproses!")
    }
}