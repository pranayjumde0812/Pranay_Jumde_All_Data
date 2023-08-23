package Create100ThreadsByUsingForLoop;

public class RunClass implements Runnable{

    static int i = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" "+i);
        i++;
    }

}
