package Question_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMin {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(21, "Pavan"));
        list.add(new Student(31, "Ishita"));
        list.add(new Student(41, "Ramesh"));
        list.add(new Student(23, "Pranay"));
        list.add(new Student(26, "Ankita"));


        //Finding Lowest
        // 1st approach
        Student student1 = list.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(student1.getAge() + " " + student1.getName());

        // 2nd approach
        Student student2 = list.stream().min((x, y) -> Integer.compare(x.getAge(), y.getAge())).get();
        System.out.println(student2.getAge() + " " + student2.getName());

        // 3rd approach
        Student student3 = list.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(student3.getAge() + " " + student3.getName());

        ////////////////////////////////////////////////////////////////////////////////////////////////

        // Finding Highest
        // 1st approach
        Student student4 = list.stream().max((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(student4.getAge() + " " + student4.getName());

        // 2nd approach
        Student student5 = list.stream().max((x, y) -> Integer.compare(x.getAge(), y.getAge())).get();
        System.out.println(student4.getAge() + " " + student4.getName());

        // 3rd approach
        Student student6 = list.stream().max(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(student6.getAge() + " " + student6.getName());


    }
}
