package factories;

import formats.DesktopFormat;
import formats.Format;
import notifications.DesktopNotification;
import notifications.Notification;
import styles.DesktopStyle;
import styles.Style;
import users.User;

public class DesktopFactory implements PlatformFactory {

    @Override
    public Style createStyle() {
        return new DesktopStyle();
    }

    @Override
    public Notification createNotification() {
        return new DesktopNotification();
    }

    @Override
    public Format createFormat() {
        return new DesktopFormat();
    }
}
