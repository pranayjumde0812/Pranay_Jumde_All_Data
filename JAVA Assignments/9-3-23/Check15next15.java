import java.util.Scanner;

class Check15next15{

 static boolean check(int [] arr)
 {
	 for(int i=0; i<arr.length-1;i++)
	   {
	 	  if(arr[i]==15 && arr[i+1]==15)

	 	  return true;
       }

       return false;
 }

 public static void main(String [] args){

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter size of array greater than 2");
 int n=sc.nextInt();
 int arr[]=new int[n];

 System.out.println("Enter elements of array");

 for(int i=0; i<arr.length;i++){

	  arr[i]=sc.nextInt();
  }

  boolean result=check(arr);
  System.out.println(result);
 }
}