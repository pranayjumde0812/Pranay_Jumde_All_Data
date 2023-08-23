public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Shubham");
        Student s2 = new Student(33,"Ishita");


       // int age =s1.age;
//        String name1 =s1.name;
//        String name2 = s2.name;


        System.out.println(s1.showName());
        System.out.println(s2.showName());




       // System.out.println(s2.age +" "+s2.name);

    }
}