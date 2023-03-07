import java.util.Scanner;

class QuestionNumber94
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		while(a>=0)
		{
			if(a%7==0 && a%3==0)
			{
				System.exit(0);
			}
			else if(a%3==0)
			{
				System.out.println(a+"is Multiple of 3");
			}
			else if(a%7==0)
			{
				System.out.println(a+"is Multiple of 7");
			}
			else
			{
				System.exit(0);
			}
		}
	}
}

/* Write a program to check if a given non-negative given number
is a multiple of 3 or 7, but not both */

