package oop_00000117132_GlennSebastianSastra.week09

data class Studet(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Studet("Andi", 3.2),
        Studet("Budi", 3.9),
        Studet("Citra", 2.8),
        Studet("Dewi", 3.7),
    )

    println("=== HONOR STUDENTS PIPELINE ===")
    val honorNames = students
        .filter { it.gpa >= 3.5 }
        .sortedBy { it.name }
        .map { it.name.uppercase() }

    honorNames.forEach { println("Honor Roll: $it") }
}