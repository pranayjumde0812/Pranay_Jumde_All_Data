package Test3;

import java.util.Collections;
import java.util.Vector;

public class FindMaxElementInVector {

    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();

        integers.add(10);
        integers.add(14);
        integers.add(12);
        integers.add(9);
        integers.add(7);
        integers.add(4);

        Integer max = Collections.max(integers);

        System.out.println(max);

        //////////////////////////////////////////

        Collections.sort(integers);

        int i = Collections.binarySearch(integers, 12);
        System.out.println(i);

        ///////////////////////////////////////////

        System.out.println(integers);
        Collections.rotate(integers, 2);

        System.out.println(integers);

    }
}
