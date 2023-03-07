import java.util.Scanner;

class QuestionNumber93
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		if(a>=0)
		{
			if(a%13==0)
			{
				System.out.println(a+" is Multiple of 13");
			}
			else if(a%13==1)
			{
				System.out.println(a+" is one more than Multiple of 13");
			}
		}
	}
}

/* Write a program to to test if a given non-negative number is
a multiple of 13 or it is one more than a multiple of 13 */


