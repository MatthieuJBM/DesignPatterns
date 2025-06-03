package notification_decorators;

import notifications.Notification;

public abstract class NotificationDecorator extends Notification {

    Notification notification;


    public abstract String customNotify();
}
