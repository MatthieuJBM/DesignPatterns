package factories;

import formats.Format;
import formats.MobileFormat;
import notifications.MobileNotification;
import notifications.Notification;
import styles.MobileStyle;
import styles.Style;
import users.User;

public class MobileFactory implements PlatformFactory {
    @Override
    public Style createStyle() {
        return new MobileStyle();
    }

    @Override
    public Notification createNotification() {
        return new MobileNotification();
    }

    @Override
    public Format createFormat() {
        return new MobileFormat();
    }
}
