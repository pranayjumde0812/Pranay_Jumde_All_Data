 import java.util.Scanner;

class SwapTwoNum
{
  public static void main(String [] args){

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int x=sc.nextInt();
  System.out.print("Enter Second Number: ");
  int y=sc.nextInt();

  System.out.println("Number before Swapping");
  System.out.println("x= "+x);
  System.out.println("y= "+y);

   x=x+y;
   y=x-y;
   x=x-y;

  System.out.println("Number after Swapping");
  System.out.println("x= "+x);
  System.out.println("y= "+y);
  }
}