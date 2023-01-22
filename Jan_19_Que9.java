import java.util.Scanner;

public class Jan_19_Que9
{
  public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check if it is multiple of 3 or 7 : ");
		int x=sc.nextInt();
		if(x%3==0 && x%7==0)
		{
		  System.out.println(x+" is multiple of both 3 and 7");
		}
		else if(x%7==0)
		{
		  System.out.println(x+" is multiple of 7");
		}
		else if(x%3==0)
		{
		  System.out.println(x+" is multiple of 3");
		}
		else
			System.out.println(x+" is not multiple of both 3 and 7");
  }
}