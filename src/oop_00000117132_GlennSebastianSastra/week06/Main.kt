package oop_00000117132_GlennSebastianSastra.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showtime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\n=== TESTING SMART HOME ===")
    val lamp = SmartLamp("1", "Lampu Ruang Tamu")
    lamp.turnOn()
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    speaker.turnOn()
    speaker.playMusic("Sweet Scar")
    val cctv = SmartCCTV("3", "Ezviz Garasi")
    cctv.turnOn()

    val home = SmartHomeHub()

    home.addDevice(lamp)
    home.addDevice(speaker)
    home.addDevice(cctv)

    home.activateSecurityMode()
    home.turnOffAllSwitches()
}