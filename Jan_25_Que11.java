import java.util.Scanner;

class Jan_25_Que11
{
   static boolean check5(int a[])
   {
	 for(int i=0; i<a.length ;i++)
	  {
		  if(a[i]==5 && a[i+1]==5)

		   return true;
      }
      return false;
    }

 public static void main(String [] args)
 {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of array: ");
      int n =sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter "+n+" elements : ");

      for(int i=0; i<arr.length ;i++)
      {
   	  arr[i]=sc.nextInt();
      }

      boolean b =check5(arr);
            System.out.println("The Final result = "+b);

 }
}