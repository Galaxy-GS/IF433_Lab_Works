package oop_00000117132_GlennSebastianSastra.week06

class Smartwatch : Watch(), BlutoothConnectable, Rechargeable {
    override fun showtime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBlutooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi data menggunakan charger magnetik 15W.")
    }
}