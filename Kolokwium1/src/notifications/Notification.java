package notifications;

import users.User;

public abstract class Notification {

    String message;

    public abstract String customNotify();

    void setMessage(String message) {
        this.message = message;
    }
}
