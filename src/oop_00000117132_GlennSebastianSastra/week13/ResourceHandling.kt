package oop_00000117132_GlennSebastianSastra.week13

import java.io.File

fun main() {
    print("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguuna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")
}