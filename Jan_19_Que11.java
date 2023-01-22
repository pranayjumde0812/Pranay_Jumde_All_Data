import java.util.Scanner;
class Jan_19_Que11
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the two numbers: ");
    int x=sc.nextInt();
    int y=sc.nextInt();

    boolean b=check(x,y);

    System.out.println("Final result: "+b);

  }
   static boolean check(int x, int y)
   {
     if ((x>100 && x<200) || (y>100 && y<200))
       return true;

      else
       return false;
   }

}