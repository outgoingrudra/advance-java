package Coupling.tight;

public class UserService {
    NotificationService notificationService = new NotificationService();
    public void NotifyUsers(){
        notificationService.sendNotification("Hey msg ");
    }
}
