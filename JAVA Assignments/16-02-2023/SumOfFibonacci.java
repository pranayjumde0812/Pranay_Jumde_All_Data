import java.util.Scanner;

class SumOfFibonacci
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number for range: ");
  int n=sc.nextInt();

  int n1=0,n2=1,n3;
  int sum=0;

  if(n>0)
  {
	  System.out.print(n1+" "+n2);
  }
  else
      System.out.print("Enter the valid number");

    for(int i=2; i<=n; i++)
    {
	  sum=sum+(n1+n2);
	  n3=n1+n2;
	  System.out.print(" "+n3+" ");
	  n1=n2;
	  n2=n3;
	}
  System.out.print("\nThe sum of fibonacci series = "+sum);

  System.out.println();
 }
}