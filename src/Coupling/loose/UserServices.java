package Coupling.loose;

public class UserServices {
    NotificationService notificationService ;

    public UserServices(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void NotifyUsers(String msg){
        notificationService.send(msg);
    }
}
