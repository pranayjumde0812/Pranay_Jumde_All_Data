public class Employee implements  Cloneable{

    int id ;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name =name;
    }

    public void display(){
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
    }

    Employee myClone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
}
