class Vehicle
{
 public static void main(String [] args)
 {
  Car c=new Car();
  c.carName();
  Motorcycle m=new Motorcycle();
  m.motorcycleName();

 }

}

class Car extends Vehicle
{
 void carName()
 {
	System.out.println("I am Car my name is Maruti-800");
 }
}

class Motorcycle extends Vehicle
{
 void motorcycleName()
 {
   System.out.println("I am Motor-Cycle my name is Hero Ignitor");
 }
}