package factories;

import formats.Format;
import formats.WebFormat;
import notifications.Notification;
import notifications.WebNotification;
import styles.Style;
import styles.WebStyle;
import users.User;

public class WebFactory implements PlatformFactory {
    @Override
    public Style createStyle() {
        return new WebStyle();
    }

    @Override
    public Notification createNotification() {
        return new WebNotification();
    }

    @Override
    public Format createFormat() {
        return new WebFormat();
    }
}
