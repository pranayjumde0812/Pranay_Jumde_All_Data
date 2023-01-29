import java.util.Scanner;

/*Write a C program to compute the sum of the two given arrays
  of integers, length 3 and find the array which has the largest sum.*/

class Jan_25_Que1
{
 public static void main(String [] args)
 {
	 int sum1=0,sum2=0;
   Scanner sc = new Scanner(System.in);
   int arr1[] = new int[3];
   int arr2[] = new int[3];
   System.out.println("Enter 3 elements for Array 1: ");

   for(int i=0; i<arr1.length ;i++)
   {
	  arr1[i]=sc.nextInt();
	  sum1=sum1+arr1[i];
   }

  System.out.println("Enter 3 elements for Array 2: ");

    for(int i=0; i<arr2.length ;i++)
    {
   	  arr2[i]=sc.nextInt();
	  sum2=sum2+arr2[i];
    }

    if(sum1>sum2)
    {
		System.out.println("Array 1 has largest sum of elements");
	}
	else if(sum2>sum1)
    {
       System.out.println("Array 2 has largest sum of elements");
    }
    else
       System.out.println("Both array sum is equal");



 }
}