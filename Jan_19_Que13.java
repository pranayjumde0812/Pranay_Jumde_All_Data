import java.util.Scanner;

class Jan_19_Que13
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the three numbers: ");
    int x=sc.nextInt();
    int y=sc.nextInt();

    boolean b=check(x,y);

    System.out.println("Final result: "+b);

  }
   static boolean check(int a, int b)
   {
     if ((a>20 && a<50) || (b>20 && b<50))
     {
       return true;
     }
      else
       return false;
   }

}