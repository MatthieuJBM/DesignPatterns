package factories;

import formats.Format;
import notifications.Notification;
import styles.Style;
import users.User;

public interface PlatformFactory {

    Style createStyle();

    Notification createNotification();

    Format createFormat();

}
