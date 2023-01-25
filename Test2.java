import java.util.Scanner;

class Test2
{

 public static void main(String [] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("enter the no");
  int n=sc.nextInt();
  int y=0;

   while(n>0 && n<500)
   {
     int x=n%10;
     y=y+x;
     n=n/10;
   }
 System.out.println("Position integer = "+y);

 }
}