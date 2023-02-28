import java.util.Scanner;

class StringPalindrome
{
 public static void main(String [] args)
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

    String rev=reverseString(s);

     if(rev.equalsIgnoreCase(s))
     {
		  System.out.println("Given string is a palindrome");
	 }
	 else
	      System.out.println("Given string is not a palindrome");
 }
}
