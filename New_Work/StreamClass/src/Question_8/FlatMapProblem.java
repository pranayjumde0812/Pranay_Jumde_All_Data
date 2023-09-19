package Question_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapProblem {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(13, 87, 9, 78));
        listOfLists.add(Arrays.asList(78, 88, 90, 7, 77));
        listOfLists.add(Arrays.asList(43, 23, 11, 72, 42, 99, 50));
        listOfLists.add(Arrays.asList(3, 37, 7, 68, 82));

        System.out.println(listOfLists);

        List<Integer> mergedList = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(mergedList);

        Integer sumOfMergedList = mergedList.stream().reduce(0, Integer::sum);
        System.out.println(sumOfMergedList);
    }
}
