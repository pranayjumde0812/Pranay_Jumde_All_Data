import java.util.Scanner;

class RecursiveFibonacci
{
	static int fibonacci(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return n;
		}

		return fibonacci(n-1)+fibonacci(n-2);
	}

  public static void main(String [] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();

     int result=fibonacci(n);
     System.out.println("f("+n1+") = "+result);
  }
}