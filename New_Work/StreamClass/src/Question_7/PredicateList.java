package Question_7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 7, 5, 6, 9, 4, 19, 17, 14);

        // We create predicate
        Predicate<Integer> predicate = l -> l > 10;

        List<Integer> list1 = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(list1);

        // Direct Approach
        List<Integer> list2 = list.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(list2);

        // By creating the method
        List<Integer> list3 = list.stream().filter(PredicateList::smallerThanTen).collect(Collectors.toList());
        System.out.println(list3);

    }

    static boolean smallerThanTen(Integer num) {
        return num > 10;
    }
}
