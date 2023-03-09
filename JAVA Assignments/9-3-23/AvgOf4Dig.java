import java.util.Scanner;

class AvgOf4Dig
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 4 numbers: ");
   int num1=sc.nextInt();
   int num2=sc.nextInt();
   int num3=sc.nextInt();
   int num4=sc.nextInt();

   int avg;

   avg=(num1+num2+num3+num4)/4;

   System.out.println("The average of four numbers is "+avg);
   }
 }