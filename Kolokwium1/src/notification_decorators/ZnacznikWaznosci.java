package notification_decorators;

import notifications.Notification;

public class ZnacznikWaznosci extends NotificationDecorator {


    public ZnacznikWaznosci(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Znacznik Ważności.";
    }
}
