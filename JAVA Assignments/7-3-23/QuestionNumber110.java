import java.util.Scanner;

class QuestionNumber110
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		int i;
		System.out.println("Enter the element of the array of length 3 : ");
		for(i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
			if(arr[i]==5 && arr[i+1]==7)
			{
				arr[i+1]=1;
			}
		}
		System.out.println("New array :");
		for(i=0;i<3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

/*Write a program to check a given array of integers, length 3
and create a  new array. If there is a 5 in the given array
immediately followed by a 7 then set 7 to 1.*/