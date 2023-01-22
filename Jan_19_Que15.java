import java.util.Scanner;

class Jan_19_Que15
{

    public static void main(String [] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two numbers:  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);


        if ((a>=40 && a<=50 && b>=40 && b<=50) || (a>=50 && a<=60 && b>=50 && b<=60))
        {
		  System.out.println("The entered number is in range");
		}

		else
		{
			System.out.println("The entered number is not in range");
		}


	}
}