import java.util.Scanner;

class SumOfTwoArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array 1 : ");
		int len1=sc.nextInt();
		System.out.println("Enter the length of array 2 : ");
		int len2=sc.nextInt();
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		int arr3[]=new int[len1];
		if(len1!=len2)
		{
			System.out.println("Both array must have same length ");
			return;
		}

		System.out.println("Enter the elements of array 1 : ");
		for(int i=0;i<len1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the elements of array  2: ");
		for(int i=0;i<len2;i++)
		{
			arr2[i]=sc.nextInt();
		}

		System.out.println("Addition of two array ");
		for(int i=0;i<len1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
	}
}


/*WAP in java to find Sum of Two Arrays Elements*/
