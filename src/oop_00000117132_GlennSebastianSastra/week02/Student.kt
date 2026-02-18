package oop_00000117132_GlennSebastianSastra.week02

class Student(
    val nim: String,
    val name: String,
    var major: String
) {

    init {
        if (nim.length != 8) {
            println("WARNING: NIM harus 8 digit!")
        }
    }
}