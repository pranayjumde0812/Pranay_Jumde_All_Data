package AnnonymusClass;

public class Annonymus {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("hello");
            }
        });

        t1.start();

        System.out.println("Main thread");

    }
}
