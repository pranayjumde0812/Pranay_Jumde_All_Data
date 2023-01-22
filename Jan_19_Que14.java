import java.util.Scanner;

class Jan_19_Que14
{

    public static void main(String [] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any two numbers:  ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);


        if ((a>b && a<100) || (a<b && a>100))
        {
		  System.out.println(a+" is nearest Number to 100 ");
		}
		else if((b>a && b<100) || (b<a && b>100))
		{
          System.out.println(b+" is nearest Number to 100 ");
		}
		else if (a==b)
		{
		  System.out.println("Both numbers are same = "+0);
		}


	}
}