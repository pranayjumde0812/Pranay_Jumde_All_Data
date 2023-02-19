import java.util.Scanner;

class Feb_16_Q3
{
 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number of days");
  int days=sc.nextInt();
  int week,year;

  year=days/365;
  week=days/7;

  System.out.println("Year = "+year);
  System.out.println("Week = "+week);
  System.out.println("Days = "+days);

 }
}