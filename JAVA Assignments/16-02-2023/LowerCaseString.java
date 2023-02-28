import java.util.Scanner;

class LowerCaseString
{
 public static void main(String [] args)
 {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the String: ");
   String s=sc.next();

   String nstr="";

   char ch[]=s.toCharArray();

   for(int i=0; i<ch.length; i++)
   {
	 if(ch[i]>=65 && ch[i]<=90)
	 {
		nstr=nstr+(char)(ch[i]+32);
	 }
	 else
	     nstr=nstr+ch[i];
   }

   System.out.println(nstr);
 }
}
