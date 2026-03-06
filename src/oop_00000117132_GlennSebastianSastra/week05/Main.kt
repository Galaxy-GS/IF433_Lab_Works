package oop_00000117132_GlennSebastianSastra.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n\n=== Math Helper ===")
    val math = MathHelper()

    println("Luas persegi: ${math.hitungLuas(8)} cm²")
    println("Luas persegi panjang: ${math.hitungLuas(6,7)} cm²")
    println("Luas lingkaran: ${math.hitungLuas(10.0)} cm²")

    println("\n\n=== Sistem Pembayaran ===")
    val wallet = EWallet("Budi", 50000.0)
    val card = CreditCard("Chandra", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, card)

    //sudah smart casting
    for (payment in payments) {
        payment.processPayment(75000.0)
        if (payment is EWallet) {
            println("${wallet.accountName} sedang melakukan top up.")
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
    }
    println("Hebat kamu bud!")

}