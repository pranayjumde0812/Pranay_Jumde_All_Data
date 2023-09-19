package Set;

import java.util.HashSet;

public class HashSetUnion {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(90);
        set1.add(4);
        set1.add(6);
        set1.add(7);

        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(7);
        set2.add(9);

        System.out.println(set2);

        HashSet<Integer> set3 = new HashSet<>();

        System.out.println(set1.addAll(set2));
        System.out.println(set1);

    }
}
