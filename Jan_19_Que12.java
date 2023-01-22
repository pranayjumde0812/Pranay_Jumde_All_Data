import java.util.Scanner;

class Jan_19_Que12
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the three numbers: ");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();

    boolean b=check(x,y,z);

    System.out.println("Final result: "+b);

  }
   static boolean check(int x, int y,int z)
   {
     if ((x>20 && x<50) || (y>20 && y<50) || (z>20 && z<50))
     {
       return true;
     }
      else
       return false;
   }

}