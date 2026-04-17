package oop_00000117132_GlennSebastianSastra.week08

class NotificationService {
    fun sendEmail (emailAdress: String) {
        println("Mengirim email ke: $emailAdress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email)

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}