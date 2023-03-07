import java.util.Scanner;

class OctalToDecimall
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Octal number : ");
		long num=sc.nextLong();
		long dec=0,digit=0;
		while(num>0)
		{
			long rem=num%10;
			dec=dec+rem*power(8,digit);
			digit++;
			num=num/10;
		}
		System.out.println("Decimal Eqivalent of Octal number is : "+dec);
	}

	static int power(int n,long digit)
	{
		int pw=1;
		while(digit>0)
		{
			pw=pw*n;
			digit--;
		}
		return pw;
	}
}

/*WAP in java to convert Octal number to equivalent decimal
number*/