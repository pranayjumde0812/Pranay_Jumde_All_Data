import java.util.Scanner;

class Test1
{
  public static void main(String [] args)
  {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the no.");
	int x=sc.nextInt();

	System.out.println("Before 2 bits shift to left");
	System.out.println("x = "+x);

	 x=x<<2;

	 System.out.println("After 2 bits shift to left");
	 System.out.println("x = "+x);
  }
}