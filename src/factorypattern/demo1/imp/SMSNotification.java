package factorypattern.demo1.imp;

import factorypattern.demo1.Notification;

public class SMSNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("SMS is sending with messsage: " + msg);
    }
}
