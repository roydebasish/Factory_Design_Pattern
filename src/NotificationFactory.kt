import javax.swing.plaf.BorderUIResource;

object NotificationFactory {
    fun createNotification(channel : String) : Notification{

        return when (channel) {
             "SMS" -> SMSNotification()
             "EMAIL" -> EmailNotification()
             "PUSH" -> PushNotification()
            else -> {
                throw IllegalArgumentException("Unknown Channel$channel")
            }
        }

    }
}
