import java.util.Scanner;


public class ItemWeight
{
	public static void main(String[] main)
	{
		Scanner sc=new Scanner(System.in);
		float w1,w2,n1,n2;
		double avg;
		System.out.println("Enter the two item weight");
		w1=sc.nextFloat();
		w2=sc.nextFloat();

		System.out.println("Enter the two number of purchases");
		n1=sc.nextFloat();
		n2=sc.nextFloat();

		avg=((w1*n1)+(w2*n2))/(n1+n2);
		System.out.println("Average : "+avg);
	}
}

/*WAP that accept two items weight (floating point values) and number of
purchase(floating point values) and calculate average value of items*/