import java.util.Scanner;

class Feb_16_Q5
{
 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Weight of 1st item");
  float weight1=sc.nextFloat();
  System.out.println("Enter number of 1st item purchased");
  float purchase1=sc.nextFloat();
  System.out.println("Enter Weight of 2nd item");
  float weight2=sc.nextFloat();
  System.out.println("Enter number of 2nd item purchased");
  float purchase2=sc.nextFloat();

  float avg, purchase,total;

  purchase=purchase1+purchase2;

  total=(weight1*purchase1)+(weight2*purchase2);

  avg=total/purchase;

  System.out.println("Average value of all items: "+avg);
 }
}