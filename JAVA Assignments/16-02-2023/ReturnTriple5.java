import java.util.Scanner;

class ReturnTriple5
{

  public static void main(String [] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter two numbers: ");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int sum=a+b;

   if(a==b)
   {
	 System.out.println("The two numbers are same:-  sum = "+sum*3);
   }
   else
     System.out.println("The two numbers are different:-  sum = "+sum);

  }
}