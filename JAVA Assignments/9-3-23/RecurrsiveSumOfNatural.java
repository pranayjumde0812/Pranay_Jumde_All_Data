/*WAP to the sum of natural number using recursion */

import java.util.Scanner;

class RecurrsiveSumOfNatural
{
	static int sumOfNatural(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
		 return n;
		}

		return n+sumOfNatural(n-1);
	}

 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the positive integer number");
   int n=sc.nextInt();

   int sum=sumOfNatural(n);
   System.out.println("Sum = "+sum);
 }
}