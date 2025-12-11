package dip;

/**
 * Abstraction.
 * High-level modules (AlertService) should depend on THIS,
 * not on low-level modules (EmailSender).
 */
public interface NotificationChannel {
    void send(String message);
}
