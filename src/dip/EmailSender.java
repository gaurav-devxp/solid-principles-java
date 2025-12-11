package dip;

public class EmailSender implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
