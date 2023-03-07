import java.util.Scanner;

class QuestionNumber101
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		System.out.println("Enter the length of the array : ");
		int ln=sc.nextInt();
		int[] arr=new int[ln];
		System.out.println("Enter the element of the array : ");
		for(int i=0;i<ln;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr[0]==arr[ln-1])
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


/* Write a program to check a given array of integers of length
1 or more and return true if the first element and the
last element are equal in the given array.*/