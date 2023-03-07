import java.util.Scanner;

class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number : ");
		long num=sc.nextLong();
		long dec=0,digit=0;
		while(num>0)
		{
			long rem=num%10;
			dec=dec+rem*power(2,digit);
			digit++;
			num=num/10;
		}
		System.out.println("Decimal Eqivalent of binary number is : "+dec);
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

/*WAP in java to convert binary number to equivalent decimal
number*/