package waitandnotify;

public class WaitAndNotifyDemo implements Runnable{

    int total1;
    int total2=1;
    int total3=900000;


    @Override
    public void run() {

        synchronized (this){

            for (int i = 1 ; i <= 100 ; i++){
                total1 += i;
//                total2 =total2 * i;
//                total3 /= i;
            }

            notify();
        }

    }
}
