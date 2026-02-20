package oop_00000117132_GlennSebastianSastra.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh ngatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }
}