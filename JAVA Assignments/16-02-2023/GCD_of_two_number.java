 import java.util.Scanner;

 class GCD_of_two_number
 {
   public static void main(String [] args)
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the first number: ");
    int n1=sc.nextInt();
   System.out.println("Enter the second number: ");
    int n2=sc.nextInt();

    int gcd=0;
    int i=1;

    while(i<=n1 && i<=n2)
    {
		if(n1%i==0 && n2%i==0)
		{
		  gcd=i;
		}

		i++;
	}

	System.out.println("GCD of two numbers = "+gcd);
  }
}