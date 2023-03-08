import java.util.Scanner;

public class MaximumNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && b>c)
		{
			System.out.println("Max number :"+a);
		}
		else if(b>a && a>c)
		{
			System.out.println("Max number :"+b);
		}
		else
		{
			System.out.println("Max number :"+c);
		}
	}
}

/*WAP that accept 3 integers and find the maximum of 3*/
