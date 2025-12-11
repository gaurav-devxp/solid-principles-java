package dip;

public class DipDemo {
    public static void main(String[] args) {
        System.out.println("--- Dependency Inversion Principle Demo ---");

        // We can swap implementations without changing AlertService
        NotificationChannel email = new EmailSender();
        NotificationChannel sms = new SmsSender();

        AlertService emailAlert = new AlertService(email);
        emailAlert.notifyUser("Server is down!");

        AlertService smsAlert = new AlertService(sms);
        smsAlert.notifyUser("Server is back up!");

        System.out.println("DIP demonstrated: AlertService depends on NotificationChannel, not concrete classes.");
    }
}
