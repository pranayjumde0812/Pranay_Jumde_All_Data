public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        // Create an object naturally
        Employee e1 = new Employee(10,"Pranay");
        e1.display();

        // create another object by cloning

        Employee e2 = e1.myClone();
        e2.display();

    }
}