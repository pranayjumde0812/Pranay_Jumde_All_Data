 import java.util.Scanner;

 class RemoveSpaceString
 {
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String s=sc.nextLine();

    String nstr="";

    char ch[]=s.toCharArray();

    for(int i=0; i<ch.length; i++)
    {
		if(ch[i]!=' ')

			  nstr=nstr+ch[i];
	}
	System.out.println(nstr);
  }
 }