package Question_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCounting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ankita", "Pranay", "Rahul", "Ambika", "Aman", "Ishita", "Bharu", "Neha", "1", "22", "333"));

        Map<Integer, List<String>> map = names
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(map);

        Map<Integer, Long> map1 = names
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(map1);

        map1.forEach((key, value) -> System.out.println("String of length " + key + " have " + value + " Strings"));
    }
}