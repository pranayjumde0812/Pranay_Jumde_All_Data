package ListIterator;

import java.util.*;

public class ListItr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);

        ListIterator<Integer> itr = list.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("=================================================================");

        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        System.out.println("=================================================================");


        List<String> list1 = new LinkedList<>();
        list1.add("Pranay");
        list1.add("Shubham");
        list1.add("Bhagyashree");
        list1.add("Swapnil");



        ListIterator<String> itrr = list1.listIterator();

        while (itrr.hasNext()){
            System.out.println(itrr.next());
        }

        System.out.println("=================================================================");

        while (itrr.hasPrevious()){
            System.out.println(itrr.previous());
        }

    }
}
