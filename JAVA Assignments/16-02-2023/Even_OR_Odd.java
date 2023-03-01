import java.util.Scanner;

class Even_OR_Odd
{
  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number : ");
   int n=sc.nextInt();

   if(n%2==0)
   {
    System.out.println("The given number is EVEN");
   }
    else
    System.out.println("The given number is ODD");
  }
}