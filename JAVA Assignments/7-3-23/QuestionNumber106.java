import java.util.Scanner;

class QuestionNumber106
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[2];
		System.out.println("Enter the length of the array : ");
		int ln=sc.nextInt();
		int[] arr=new int[ln];
		System.out.println("Enter the element of the array : ");
		for(int i=0; i<ln; i++)
		{
			arr[i]=sc.nextInt();
		}
		a[0]=arr[0];
		a[1]=arr[ln-1];
		System.out.println("New array with first and last elements of first array : ["+a[0]+", "+a[1]+"]");
	}
}

/*Write a program to create a new array taking the first and
last elements of a given array of integers and length one or
more.*/