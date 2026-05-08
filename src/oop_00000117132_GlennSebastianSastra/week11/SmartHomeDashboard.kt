package oop_00000117132_GlennSebastianSastra.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        "Phillips WiZ Living Room",
        "Lighting"
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}