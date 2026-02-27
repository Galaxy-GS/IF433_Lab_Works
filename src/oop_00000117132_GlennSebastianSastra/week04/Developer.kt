package oop_00000117132_GlennSebastianSastra.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}