import java.util.Scanner;

class QuestionNumber107
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[2];
		System.out.println("Enter the element of the array of length 2 : ");
		for(int i=0;i<2;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(arr[0]==15 || arr[0]==20 || arr[1]==15 || arr[1]==20)
		{
			System.out.println("Yes, the array contains 15 or 20");
		}
		else
		{
			System.out.println("No, the array does not contains 15 or 20");
		}
	}
}

/*Write a program to check if a given array of integers and
length 2, contains 15 or 20.*/