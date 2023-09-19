package Question_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombiningOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 7, 5, 6, 9, 4, 19, 17, 14);

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);


        int oddDoubledSum = list.stream().filter(i -> i % 2 != 0).map(p -> p * 2).reduce(0, Integer::sum);

        System.out.println(oddDoubledSum);
    }
}
