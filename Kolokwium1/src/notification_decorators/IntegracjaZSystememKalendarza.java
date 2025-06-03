package notification_decorators;

import notifications.Notification;

public class IntegracjaZSystememKalendarza extends NotificationDecorator {

    public IntegracjaZSystememKalendarza(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String customNotify() {
        return notification.customNotify() + " Integracja z Systemem Kalendarza.";
    }
}
