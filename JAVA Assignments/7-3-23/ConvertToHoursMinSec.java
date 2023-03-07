import java.util.Scanner;

class ConvertToHoursMinSec
{
  public static void main(String [] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value in seconds");
	  int input=sc.nextInt();

	  int rem;

	  int hour=input/3600;
	  rem=input%3600;
	  int min=rem/60;
	  rem=input%60;
	  int sec=rem;

	  System.out.println(hour+" Hour : "+min+" Minutes : "+sec+" Seconds");

  }
}