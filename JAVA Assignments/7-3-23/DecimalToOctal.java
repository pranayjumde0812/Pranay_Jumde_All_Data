import java.util.Scanner;

class DecimalToOctal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num=sc.nextInt();
		String oct="";
		while(num>0)
		{
			int rem=num%8;
			oct=rem+oct;
			num=num/8;
		}
		System.out.println("Octal Equivalent of decimal number is : "+oct);
	}
}

/*WAP in java to covert decimal number to Octal equivalent*/
