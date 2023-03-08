import java.util.Scanner;

public class BikeAvg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total distance travelled in km : ");
		int dis=sc.nextInt();
		System.out.println("Enter the fuel burn in liters :");
		float fuel=sc.nextFloat();

		float avg=dis/fuel;
		System.out.println("Bike average : "+avg+ " Km/Lit");
	}
}


/*WAP to calculate bike average consumption from given total distance (integer value)
travelled in km and spend fuel (in liters, float number : 2 decimal point)*/
