package notifications;

import styles.Style;
import users.User;

public class MobileNotification extends Notification {
    public MobileNotification() {
    }

    @Override
    public String customNotify() {
        System.out.println("Mobile Push-Notification.");
        return "Mobile Push-Notification.";
    }
}
