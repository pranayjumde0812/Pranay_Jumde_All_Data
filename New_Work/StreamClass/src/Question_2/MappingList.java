package Question_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 7, 5, 6, 9, 4);

//        list.stream().map(i-> i * 2).forEach(System.out::println);

        List<Integer> list1 = list.stream().map(integer -> integer * 2).collect(Collectors.toList());

        System.out.println(list1);
    }
}
