import java.util.Scanner;

class QuestionNumber103
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		int i;
		System.out.println("Enter the element of the array of length 4 : ");
		for(i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("New Array after rotation in left direction : ");
		for(i=1;i<4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[0]);
	}
}

/* Write a program to rotate the elements of a given array of
integers (length 4 ) in left direction and return the new array. */