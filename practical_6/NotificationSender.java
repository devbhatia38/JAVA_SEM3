package practical_6;

interface Notifier {
    void send(String message);
}

interface Urgent {
}

class UrgentNotifier implements Notifier, Urgent {
    public void send(String message) {
        System.out.println("Urgent: " + message);
    }
}

public class NotificationSender {
    public static void main(String[] args) {
        Notifier email = message -> System.out.println("Email: " + message);
        Notifier sms = message -> System.out.println("SMS: " + message);
        Notifier urgent = new UrgentNotifier();

        Notifier[] senders = {email, sms, urgent};

        String message = "Your account has been updated.";

        for (int i = 0; i < senders.length; i++) {
            senders[i].send(message);
        }
    }
}