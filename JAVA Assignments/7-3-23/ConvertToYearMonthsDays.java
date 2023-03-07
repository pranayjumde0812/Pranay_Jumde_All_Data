import java.util.Scanner;

class ConvertToYearMonthsDays
{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value in days");
	  int days=sc.nextInt();

	  int rem;


	  int Year=days/365;
	  rem=days%365;
	  int Month=rem/30;
	  rem=days%30;
	  int Days=rem;

	  System.out.println(Year+" Year "+Month+" Months "+Days+" Days");

  }
}