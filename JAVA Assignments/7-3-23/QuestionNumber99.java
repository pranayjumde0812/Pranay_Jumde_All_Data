import java.util.Scanner;

class QuestionNumber99
{
	public static int logic()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two integers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
		{
			return 0;
		}
		else if(a%5 == b%5 && a>b)
		{
			return b;
		}
		else if(a%5 == b%5 && a<b)
		{
			return a;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		System.out.println(logic());
	}
}

/* Write a program to find the larger from two given integers.
However if the two integers have the same remainder when divided
by 5, then the return the smaller integer. If the two integers
are the same, return 0. */