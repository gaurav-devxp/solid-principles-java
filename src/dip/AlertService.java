package dip;

/**
 * High-level module.
 * Depends on Abstraction (NotificationChannel).
 * Inversion of Control is achieved via Constructor Injection.
 */
public class AlertService {
    private final NotificationChannel channel;

    // Constructor Injection
    public AlertService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notifyUser(String message) {
        channel.send(message);
    }
}
