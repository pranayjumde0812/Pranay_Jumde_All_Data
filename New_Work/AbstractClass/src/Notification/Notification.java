package Notification;

public abstract class Notification {

    abstract public void alertSound();

    public void display(String message) {
        System.out.println(message);
    }
}
