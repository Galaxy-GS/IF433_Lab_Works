package oop_00000117132_GlennSebastianSastra.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 8) {
        println("NIM tidak valid! Harus 8 digit.")
        return
    }

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    val student = Student(nim, name, major)

    println("Data Mahasiswa berhasil dibuat!")
}