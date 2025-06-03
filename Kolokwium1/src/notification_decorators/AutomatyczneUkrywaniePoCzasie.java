package notification_decorators;

import notifications.Notification;

public class AutomatyczneUkrywaniePoCzasie extends NotificationDecorator {

    public AutomatyczneUkrywaniePoCzasie(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Automatyczne Ukrywanie Po Czasie.";
    }
}
