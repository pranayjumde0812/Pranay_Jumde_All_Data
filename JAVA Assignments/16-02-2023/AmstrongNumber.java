import java.util.Scanner;

class AmstrongNumber
{

	static int countDigits(int n)
	    {
			int count=0;
			while(n!=0)
			{
				 count++;
				 n=n/10;
			}

			return count;
		}

		static int power(int r, int p)
		{
	      int pw=1;

	      while(p>0)
	      {
			  pw=pw*r;
			  p--;
		  }
		  return pw;
		}
		 static boolean isAmstrong(int x)
		 {
			 int nd=countDigits(x);
			 int t=x;
			 int r,sum=0;

			 while(x!=0)
			 {
				r=x%10;
				sum=sum+power(r,nd);
				x=x/10;
			 }

			 if(t==sum)
			 return true;
			 else
			 return false;
	 }

 public static void main(String [] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int n=sc.nextInt();

	 boolean res=isAmstrong(n);

	 if(res)
	 {
		System.out.println(n+" is a Amstrong number");
	 }
	 else
	 {
		System.out.println(n+" is not a Amstrong number");
	 }
 }
}