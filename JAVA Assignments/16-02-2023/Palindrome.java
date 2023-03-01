import java.util.Scanner;

class Palindrome
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the end number: ");
   int n=sc.nextInt();

   int r,sum=0;
   int temp=n;

   while(n!=0)
   {
	 r=n%10;
	 sum=(sum*10)+r;
	 n=n/10;
   }

   if(sum==temp)
    System.out.println("The given number is Palindrome");
    else
     System.out.println("The given number not is Palindrome");
  }
 }