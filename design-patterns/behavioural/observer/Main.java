
public class Main{
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        Observer email = new EmailObserver();
        Observer sms = new SMSObserver();

        notificationService.addObserver(email);
        notificationService.addObserver(sms);

        notificationService.setMessage("Booking confirm");
    }
}