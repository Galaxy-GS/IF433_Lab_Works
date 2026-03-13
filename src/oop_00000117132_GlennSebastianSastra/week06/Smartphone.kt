package oop_00000117132_GlennSebastianSastra.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smarthphone berhasil booting.")
    }
}