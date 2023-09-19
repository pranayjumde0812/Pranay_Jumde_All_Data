package Question_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringAndMapping {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ankita", "Pranay", "Rahul", "Ambika", "Aman"));

        System.out.println(names);

        names.stream().filter(i -> i.startsWith("A")).forEach(System.out::println);
    }
}
