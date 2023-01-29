import java.util.Scanner;

/*Write a C program to create an array taking two middle
  elements from a given array of integers of length even.*/

class Jan_25_Que2
{
 public static void main(String [] args)
 {
   int sum1=0,sum2=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the even number of array");
   int n=sc.nextInt();
   int arr[] = new int[n];
   int arr1[] = new int[2];


  if(n%2==0)
  {
   System.out.println("Enter elements: ");
   for(int i=0; i<arr.length ;i++)
   {
	  arr[i]=sc.nextInt();
   }
   int n1=n/2;
   int n2=(n/2)-1;

   arr1[0]=arr[n2];
   arr1[1]=arr[n1];

   System.out.println("["+arr1[0]+" "+arr1[1]+"]");
  }
  else
     System.out.println("array size is not even");

 }
}