package notifications;

public class DesktopNotification extends Notification {

    public DesktopNotification() {
    }

    @Override
    public String customNotify() {
        System.out.println("Detailed Desktop Notification. Action Button.");
//        if (user instanceof Admin) {
        return "Desktop Notification.";
//        } else {
//            return "Normal Desktop Notification.";
//        }
    }
}
