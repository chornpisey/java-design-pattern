package factorypattern.demo1;

import factorypattern.demo1.factory.NotificationFactory;

public class MainDemo1 {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getInstance("email");
        notification.send("Hello");
    }
}
