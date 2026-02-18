package oop_00000117132_GlennSebastianSastra.week02

fun main() {
    val scanner = Scanner(System.`in`)

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextLine().toInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("=== Detail Peminjaman ===")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Denda: Rp ${loan.calculateFine()}")
}