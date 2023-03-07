import java.util.Scanner;

class DecimalToBinary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num=sc.nextInt();
		String bin="";
		while(num>0)
		{
			int rem=num%2;
			bin=rem+bin;
			num=num/2;
		}
		System.out.println("Binary Equivalent of decimal number is : "+bin);
	}
}

/*WAP in java to covert decimal number to binary equivalent*/