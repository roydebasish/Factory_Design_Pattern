
    fun main() {

        val notificationFactory =  NotificationFactory
        val notification = notificationFactory.createNotification("EMAIL");
        notification.sendNotification();
    }