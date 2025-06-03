package notification_decorators;

import notifications.Notification;

public class MechanizmPotwierdzenia extends NotificationDecorator {

    public MechanizmPotwierdzenia(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Mechanizm Potwierdzenia.";
    }
}
