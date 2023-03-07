import java.util.Scanner;

class QuestionNumber104
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int[] rev=new int[5];
		int i,j=5;
		System.out.println("Enter the element of the array of length 5 : ");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse array : ");
		for(i=0;i<5;i++)
		{
			rev[j-1]=arr[i];
			j=j-1;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(rev[i]+" ");
		}
		System.out.println();
	}
}

/*Write a program to reverse a given array of integers and
length 5.*/