import java.util.Scanner;

public class ConvertYearWeekDays
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days your want to convert :");
		int days=sc.nextInt();
		int week,year;
		year=days/365;
		days=days%365;
		week=days/7;
		days=days%7;
		System.out.println(year+" Years  "+week+" week  "+days+" days");
	}
}

/*WAP to convert specified days into year, week and days*/
