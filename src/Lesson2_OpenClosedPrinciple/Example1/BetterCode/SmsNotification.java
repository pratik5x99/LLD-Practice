package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

public class SmsNotification implements Notification {
    public void send(){
        System.out.println("Sending SMS");
    }
}
