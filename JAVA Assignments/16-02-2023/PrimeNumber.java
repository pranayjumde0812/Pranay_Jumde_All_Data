import java.util.Scanner;

class PrimeNumber
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the end number: ");
   int n=sc.nextInt();

   int m=n/2;
   int flag=0;

    if(n==0 || n==1)
    {
	  System.out.println("It is not Prime number");
	}
    else
    {
	  for(int i=2; i<m ; i++)
	  {
		if(n%i==0)
		{
		  flag=1;
		  System.out.println(n+" is not prime number");
		  break;
		}
	  }

	  if(flag==0)
	  {
		  System.out.println(n+" is a prime number");
	  }
	}
 }
}