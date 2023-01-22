import java.util.Scanner;

class TrueQue7
{
	public static boolean returnTrue(int x, int y)
	{
     if(x==30 || y==30)
     {
		 return true;
	 }
	 else if(x+y==30)
	 {
		return true;
	 }
	 else
	  return false;

	}

  public static void main(String[] args)
  {

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Number:  ");
   int num1=sc.nextInt();
   System.out.println("num1 = "+num1);
   int num2=sc.nextInt();
   System.out.println("num2 = "+num2);

   boolean b= returnTrue(num1, num2);
   System.out.println("The Solution is "+b);
  }
}