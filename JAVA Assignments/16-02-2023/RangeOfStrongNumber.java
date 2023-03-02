import java.util.Scanner;

class RangeOfStrongNumber
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

  System.out.println("The Strong number present in entered range from 1 to n");

for(int i=1; i<=n; i++)
{
  int num=i;
  int r,temp,sum=0;

  temp=i;

  while(num!=0)
  {
	  r=num%10;
	  sum=sum+fact(r);
	  num=num/10;
  }

  if(temp==sum)
  {
   System.out.println(sum);
   }
  }
 }
}