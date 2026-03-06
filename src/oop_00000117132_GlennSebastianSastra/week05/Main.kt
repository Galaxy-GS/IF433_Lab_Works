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

    println("=== Tugas Mandiri ===")
    val math = MathHelper()

    println("Luas persegi: ${math.hitungLuas(8)} cm²")
    println("Luas persegi panjang: ${math.hitungLuas(6,7)} cm²")
    println("Luas lingkaran: ${math.hitungLuas(10.0)} cm²")
}