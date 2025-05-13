package factorypattern.demo1.factory;

import factorypattern.demo1.Notification;
import factorypattern.demo1.imp.EmailNotification;
import factorypattern.demo1.imp.SMSNotification;

public class NotificationFactory {
    public static Notification getInstance(String notificationType){
        if(notificationType.equalsIgnoreCase("sms")){
            return new SMSNotification();
        }
        if(notificationType.equalsIgnoreCase("email")){
            return new EmailNotification();
        }
        return null;
    }
}
