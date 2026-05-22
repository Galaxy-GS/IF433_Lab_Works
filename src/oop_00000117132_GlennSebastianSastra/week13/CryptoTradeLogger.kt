package oop_00000117132_GlennSebastianSastra.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        return TradeRecord(parts[0].trim().toInt(), parts[1].trim(), parts[2].trim(), parts[3].trim().toDouble(), parts[4].trim().toDouble())
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("ERROR: File trade tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "LONG", 500.0, 125.5),
        TradeRecord(2, "ETHUSDT", "SHORT", 300.0, -40.0),
        TradeRecord(3, "SOLUSDT", "LONG", 250.0, 70.0),
    )
    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    loadedData.forEach {
        println(it)
    }
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}