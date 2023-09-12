package AIC;

public class MyThread {

    public static void main(String[] args) {

         new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        //t.start();
    }

}
