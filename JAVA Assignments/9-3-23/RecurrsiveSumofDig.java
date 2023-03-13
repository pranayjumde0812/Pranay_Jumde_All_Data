/*How to find the sum of digits of a positive integer number using recursion */

import java.util.Scanner;

class RecurrsiveSumofDig
{
	static int sumOfDigits(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n>=0 && n<=9)
		{
		 return n;
		}

		return n%10+sumOfDigits(n/10);
	}

 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the positive integer number");
   int n=sc.nextInt();

   int sum=sumOfDigits(n);
   System.out.println("The sum of given positive integer number by recurrsive approch = "+sum);
 }
}