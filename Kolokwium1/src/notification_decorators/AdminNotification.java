package notification_decorators;

import notifications.Notification;

public class AdminNotification extends NotificationDecorator {
    public AdminNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Admin detailed message. Action Button.";
    }
}
