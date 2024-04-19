import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        int i = System.in.read();
//        System.out.println(i);
//
//        char ch = (char) i;
//        System.out.println(ch);


        Person person = new Person();

        person.setName("Pranay");
        person.setAge(24);
        person.setCity("Nagpur");

        System.out.println(person.getName()+" "+person.getAge()+" "+person.getCity());
    }
}