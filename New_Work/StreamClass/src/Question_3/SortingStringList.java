package Question_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStringList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pavan","Pranay","Ishita","Ankita","Bharti");

//        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);

        List<String> list1 = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list1);
    }
}
