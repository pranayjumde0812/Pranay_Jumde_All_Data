package Notification;

public class Main {

    public static void main(String[] args) {

        Gmail gmail = new Gmail();
        gmail.alertSound();
        gmail.display("8 new email");


        WhatsApp whatsApp = new WhatsApp();
        whatsApp.alertSound();
        whatsApp.display("33 new message");
    }
}
