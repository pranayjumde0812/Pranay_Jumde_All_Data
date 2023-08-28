package List.ArrayList;

import java.util.ArrayList;

/*
   Write a Java program to insert an element into the array list at the first position.
 */

public class AddElementAtSpecificPosition {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        list.add(0,8);
        list.add(3,10);

        System.out.println(list);

    }
}
