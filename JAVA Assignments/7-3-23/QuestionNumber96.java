import java.util.Scanner;

class QuestionNumber96
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b+c)
		{
			System.out.println("for "+a+" , its possible");
		}
		else if(b==a+c)
		{
			System.out.println("for "+b+" , its possible");
		}
		else if(c==b+a)
		{
			System.out.println("for "+c+" , its possible");
		}
		else
			System.out.println("Its not possible");
	}
}

/*Write a program to check if it is possible to add two integers
to get the third integer from three given integers.*/
