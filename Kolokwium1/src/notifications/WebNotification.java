package notifications;

import users.User;

public class WebNotification extends Notification {

    public WebNotification() {
    }

    @Override
    public String customNotify() {
        System.out.println("Web Notification.");
        return "Web Notification.";
    }
}
