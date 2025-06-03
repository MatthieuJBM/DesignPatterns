package notification_decorators;

import notifications.Notification;

public class DolaczoneDane extends NotificationDecorator {

    public DolaczoneDane(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Dołączone Dane.";
    }
}
