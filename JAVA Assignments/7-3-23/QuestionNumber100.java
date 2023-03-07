import java.util.Scanner;

class QuestionNumber100
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the three integers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c && b>c && a-b == b-c)
		{
			check=true;
		}
		else if(a>b && a>c && c>b && a-c == c-b)
		{
			check=true;
		}
		else if(b>a && b>c && a>c && b-a == a-c)
		{
			check=true;
		}
		else if(b>a && b>c && c>a && b-c == c-a)
		{
			check=true;
		}
		else if(c>a && c>a && a>b && c-a == a-b)
		{
			check=true;
		}
		else if(c-b == b-a)
		{
			check=true;
		}
		return check;
	}

	public static void main(String[] args)
	{
		System.out.println(value());
	}
}

/* Write a program to check three given integers (small, medium
and large) and return true if the difference between small and
medium and the difference between medium and large is same. */


