import java.util.Scanner;

class Jan_25_Que8
{
 public static void main(String [] args)
 {
	 int count=0;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the size of array: ");
   int n =sc.nextInt();
   int arr[] = new int[n];
   System.out.println("Enter "+n+" elements : ");

   for(int i=0; i<arr.length ;i++)
   {
	  arr[i]=sc.nextInt();
   }


   System.out.println("Even array elements");

   for(int i=0; i<arr.length ;i++)
   {

   	  if(arr[i]%2==0)
   	  {
		System.out.println(" "+arr[i]);
        count++;
	  }
    }
     System.out.println("Count of even number present in array = "+count);
 }
}