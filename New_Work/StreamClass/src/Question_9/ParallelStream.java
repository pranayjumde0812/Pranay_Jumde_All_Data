package Question_9;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 9, 4, 7, 66, 33, 56, 90);

//        list.parallelStream().filter(i -> i % 2 == 0).forEach(System.out::println);

        list.stream().parallel().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
