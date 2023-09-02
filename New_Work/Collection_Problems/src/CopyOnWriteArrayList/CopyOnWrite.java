package CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();

        copy.add(1);
        copy.add(2);
        copy.add(4);
        copy.add(7);
        copy.add(9);
        copy.add(8);

        try {
            Iterator <Integer> itr = copy.iterator();

            while (itr.hasNext()){
                if(itr.next() == 7){
                    itr.remove();
                }
            }
        }catch (UnsupportedOperationException e ){
            System.out.println("Not supported");
        }

        System.out.println(copy.size());
    }
}
