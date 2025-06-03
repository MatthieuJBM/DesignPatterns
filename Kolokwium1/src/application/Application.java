package application;

import factories.PlatformFactory;
import formats.Format;
import notifications.Notification;
import styles.Style;
import users.User;

public class Application {
    private Format format;

    private Notification notification;

    private Style style;

    private User user;

    public Application(PlatformFactory factory, User user) {
        this.format = factory.createFormat();
        this.notification = factory.createNotification();
        this.style = factory.createStyle();
        this.user = user;
    }

    public void invokeMethods() {
        format.format();
        notification.customNotify();
        style.style();
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return this.notification;
    }
}
