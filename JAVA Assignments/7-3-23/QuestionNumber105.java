import java.util.Scanner;

class QuestionNumber105
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int[] arr1=new int[5];
		int[] arr2=new int[5];
		int[] mid=new int[2];
		System.out.println("Enter the element of the 1st array of length 5 : ");
		for(i=0;i<5;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the element of the 2nd array of length 5 : ");
		for(i=0;i<5;i++)
		{
			arr2[i]=sc.nextInt();
		}
		mid[0]=arr1[2];   // since mid of 5 is 2 because array starts with 0.
		mid[1]=arr2[2];
		System.out.print("New array with middle element of two array : ");
		System.out.println(mid[0]+" "+mid[1]);
	}
}

/*Write a program to create a new array containing the middle
elements from the two given arrays of integers, each length 5.*/