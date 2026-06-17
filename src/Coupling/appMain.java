package Coupling;

import Coupling.loose.EmailNotificationService;
import Coupling.loose.NotificationService;
import Coupling.loose.UserServices;
import Coupling.tight.UserService;


public class appMain {
    public static void main(String[] args) {
        // tight coupling
        UserService userService = new UserService();
        userService.NotifyUsers();

        //loose coupling
        NotificationService emailService = new EmailNotificationService();
        UserServices userServices = new UserServices(emailService);
        userServices.NotifyUsers("Hello from loose");
    }
}
