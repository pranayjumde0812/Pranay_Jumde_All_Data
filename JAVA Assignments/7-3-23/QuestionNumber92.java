import java.util.Scanner;

class QuestionNumber92
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the two integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==5 || b==5 ||(a+b)==5 || (a-b)==5)
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

/* Write a program that accept two integers and return true if
either one is 5 or their sum or difference is 5. */