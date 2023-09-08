import java.util.concurrent.CopyOnWriteArrayList;

public class Test extends Thread {

    //   public  ArrayList<String> l = new ArrayList<>();
    static CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        try {
            l.add("A");
            l.add("B");
            l.add("C");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        l.add("D");
        l.add("E");
        l.add("F");

        Test m = new Test();
        m.start();


        for (String s : l) {
            String a = s;
            System.out.println(a);
        }
        System.out.println(l);

    }
}

