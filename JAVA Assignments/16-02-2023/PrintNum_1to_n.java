import java.util.Scanner;

class PrintNum_1to_n
{
	public static void main(String [] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number till you want to print the number: ");

	  int n=sc.nextInt();

	  for(int i=1; i<=n; i++)
	  {
		  System.out.println(i);
	  }
	}
}