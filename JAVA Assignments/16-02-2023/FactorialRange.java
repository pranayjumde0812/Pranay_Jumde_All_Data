import java.util.Scanner;

class FactorialRange
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the end number: ");
   int n=sc.nextInt();


   for(int i=1; i<=n; i++)
   {
     System.out.println(i+" :--> "+fact(i));
   }

   static int fact(int n)
   {
	 int fact=1;
	 while(n>0)
	 {
	   fact=fact*n;
	   n--;
	 }
   }
 }
}