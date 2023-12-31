import javax.swing.plaf.BorderUIResource;

public class NotificationFactory {
    public Notification createNotification(String channel){

        if (channel==null || channel.isEmpty())
            return null;

        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown Channel" + channel);
        };

    }
}
