package oop_00000117132_GlennSebastianSastra.week06

import oop_00000117132_GlennSebastianSastra.week04.Car

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}