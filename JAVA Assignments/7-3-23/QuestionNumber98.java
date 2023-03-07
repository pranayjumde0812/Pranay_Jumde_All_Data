import java.util.Scanner;

class QuestionNumber98
{
	public static boolean logic()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the three numbers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(Math.abs(x-y)>=20 || Math.abs(y-z)>=20 || Math.abs(x-z)>=20)
		{
			check=true;
		}
		return check;
	}
	public static void main(String[] args)
	{
		System.out.println(logic());
	}

}

/* Write a program to check three given integers and return true
if one of them is 20 or more less than one of the others */