import java.util.Scanner;

class QuestionNumber102
{
	public static boolean value()
	{
		Scanner sc=new Scanner(System.in);
		boolean check=false;
		int i;
		System.out.println("Enter the length of the 1st array : ");
		int ln1=sc.nextInt();
		int[] arr1=new int[ln1];
		System.out.println("Enter the element of the 1st array : ");
		for(i=0;i<ln1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the length of the 2nd array : ");
		int ln2=sc.nextInt();
		int[] arr2=new int[ln2];
		System.out.println("Enter the element of the 2nd array : ");
		for(i=0;i<ln2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		if(arr1[0]==arr2[0] || arr1[ln1-1]==arr2[ln2-1])
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

/* Write a program to check two given arrays of integers of
length 1 or more and return true if they have the same first
element or they have the same last element. */