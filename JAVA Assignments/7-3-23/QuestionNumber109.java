import java.util.Scanner;

class QuestionNumber109
{
	public static boolean arrayy()
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
			for(int j=i+1;j<3;j++)
			{
				if(arr[j]==10 && arr[i]==10 || arr[j]==20 && arr[i]==20)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		System.out.println(arrayy());
	}
}

/*Write a program to check a given array of integers and return
true if the array contains 10 or 20 twice. The length of the
array will be 0, 1, or 2.*/