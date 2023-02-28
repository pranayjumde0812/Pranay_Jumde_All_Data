import java.util.Scanner;

class ReverseString
{
  static String reverseString(String str)
  {
	  String nstr="";
	  char ch[]=str.toCharArray();

      for(int i=ch.length-1; i>=0; i--)
      {
		  nstr=nstr+ch[i];
	  }

	  return nstr;
  }

 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string: ");
  String s=sc.nextLine();

  String rev= reverseString(s);

  System.out.println(rev);
 }
}