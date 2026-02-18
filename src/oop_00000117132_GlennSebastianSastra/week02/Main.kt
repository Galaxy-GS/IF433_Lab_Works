package oop_00000117132_GlennSebastianSastra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("1. Daftar dengan jurusan")
    println("2. Daftar tanpa jurusan")
    print("Pilih opsi: ")
    val choice = scanner.nextLine().toInt()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    val student = if (choice == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        Student(nim, name, major)
    } else {
        Student(nim, name)
    }

    println("Mahasiswa berhasil dibuat!")
}