package waitandnotify;

public class Main {
    public static void main(String[] args) {

        WaitAndNotifyDemo wt = new WaitAndNotifyDemo();

        Thread t1 = new Thread(wt);
        t1.start();

        synchronized (t1) {
            try {
                t1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(wt.total1);
            System.out.println(wt.total2);
            System.out.println(wt.total3);
        }

    }

}
