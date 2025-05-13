package factorypattern.demo1.imp;

import factorypattern.demo1.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Email is sending with message: " + msg);
    }
}
