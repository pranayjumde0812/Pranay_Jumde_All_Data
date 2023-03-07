import java.util.Scanner;

class QuestionNumber97
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(y>x && z>y)
		{
			System.out.println(z+" is greater in all three numbers");
		}
	}
}

/* Write a program to check if y is greater than x, and z is
greater than y from three given integers x,y,z */