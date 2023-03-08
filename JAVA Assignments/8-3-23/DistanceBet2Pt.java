import java.util.Scanner;

public class DistanceBet2Pt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cordinate(x,y) of starting point : ");
		int x1=sc.nextInt();
		int y1=sc.nextInt();

		System.out.println("Enter the cordinate(x,y) of end point : ");
		int x2=sc.nextInt();
		int y2=sc.nextInt();

		int x=x2-x1;
		int y=y2-y1;

		float dis=(float)Math.sqrt((x*x)+(y*y));

		System.out.println("Distance between two point : "+dis);
	}
}

/*WAP to calculate distance between two point*/
