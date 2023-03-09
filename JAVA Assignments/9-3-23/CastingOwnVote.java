import java.util.Scanner;

class CastingOwnVote
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the age of candidate");
   int age=sc.nextInt();

   if(age>=18)
   {
	   System.out.println("Candidate is eligible to vote");
   }
   else
   {
	   System.out.println("Candidate is not eligible to vote");
   }
 }
}