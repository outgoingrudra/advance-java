package Coupling.loose;

public class EmailNotificationService  implements  NotificationService{

    @Override
    public void send(String msg) {
        System.out.println("Email : "+msg);

    }
}
