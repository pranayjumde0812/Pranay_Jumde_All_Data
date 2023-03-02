import java.util.Scanner;

class StrongNumber
{
  static int fact(int num)
  {
	 int fact=1;

	 while(num>0)
	 {
	  fact=fact*num;
	  num--;
	 }

	 return fact;
  }

 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number: ");
  int n=sc.nextInt();

  int r,temp,sum=0;

  temp=n;

  while(n>0)
  {
	  r=n%10;
	  sum=sum+fact(r);
	  n=n/10;
  }

  if(temp==sum)
  System.out.println(temp+" is a strong number");
  else
  System.out.println(temp+" is not strong number");
 }
}