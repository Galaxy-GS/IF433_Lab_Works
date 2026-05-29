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
    fun processOrder(strategy: PricingStrategy, price: Double) {
        val finalPrice = strategy.calculate(price)

        repo.saveOrder("FINAL_PRICE,$finalPrice")

        notifier.sendNotification("Order berhasil diproses!")
    }
}

interface PricingStrategy{
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy{
    override fun calculate(price: Double): Double {
        return price * 0.8
    }
}

class RegularPricing : PricingStrategy{
    override fun calculate(price: Double): Double {
        return price
    }
}

fun main() {
    val repo = CsvOrderRepository("orders.csv")
    val notifier = EmailNotifier()
    val processor = SafeOrderProcessor(repo, notifier)

    processor.processOrder(VipPricing(), 1000.0)

    processor.processOrder(RegularPricing(), 500.0)
}