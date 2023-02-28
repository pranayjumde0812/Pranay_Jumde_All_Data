import java.util.Scanner;

class SortStringAcsOrder
{
 public static void main(String [] args)
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the String: ");
	 String s=sc.nextLine();

///////////////// Code for Lower Case ///////////////////////

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

///////////////////code to convert string in ascending Order//////////////////////

      char ch1[]=nstr.toCharArray();

	 for(int i=0; i<ch1.length; i++)
	 {
		 for(int j=i+1; j<ch1.length; j++)
		 {
			 if(ch1[i]>ch1[j])
			 {
		     char temp=ch1[i];
				ch1[i]=ch1[j];
				ch1[j]=temp;
			 }
		 }
	 }

	 String str=new String(ch1);

	 System.out.println(str);
 }
}