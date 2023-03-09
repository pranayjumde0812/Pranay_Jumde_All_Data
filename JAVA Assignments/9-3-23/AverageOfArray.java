import java.util.Scanner;

class AverageOfArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("Enter the elements of array : ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		float avg=sum/n;
		System.out.println("Average of array : "+avg);
	}
}

/*WAP in java to Find the average of an Array */
