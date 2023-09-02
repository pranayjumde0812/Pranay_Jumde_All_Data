package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingThreadArrayList implements Runnable{

    static ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void run() {

        synchronized (this){
            Iterator<Integer> itr = list.iterator();

            while (itr.hasNext()){
                System.out.println(itr.next());
            }
        }

    }

    public static void main(String[] args) {

        UsingThreadArrayList usingThreadArrayList = new UsingThreadArrayList();
        Thread t1 = new Thread(usingThreadArrayList);

        synchronized (UsingThreadArrayList.class){
            for (int i = 0; i < 100 ; i++){
                list.add(i);
            }
        }

        t1.start();

    }
}
