import java.util.Scanner;

class DegreeToKelAndFarhn
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Degree celcius value");
   int dc=sc.nextInt();

   int kelvin,farhn;

   kelvin=dc+273;
   farhn=(dc*9/5)+32;

   System.out.println("Degree celcius to kelvin = "+kelvin);
   System.out.println("Degree celcius to Fahrenheit = "+farhn);


 }
}