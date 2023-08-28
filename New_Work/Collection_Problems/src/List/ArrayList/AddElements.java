package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
    Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class AddElements {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();

        colorList.add("Blue");
        colorList.add("Black");
        colorList.add("Orange");

        System.out.println(colorList);
        for (String str : colorList){
            System.out.print(str+" ");
        }
    }
}
