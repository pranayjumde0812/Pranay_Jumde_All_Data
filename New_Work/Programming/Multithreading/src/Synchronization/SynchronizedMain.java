package Synchronization;

public class SynchronizedMain {

    public static void main(String[] args) {

        Sender obj = new Sender();

        ThreadSend t1 = new ThreadSend(obj, "Hiii");
        ThreadSend t2 = new ThreadSend(obj, "Zal ka J1");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

    }
}
