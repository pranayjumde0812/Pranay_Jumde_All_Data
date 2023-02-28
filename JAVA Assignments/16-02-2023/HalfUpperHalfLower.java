import java.util.Scanner;

class HalfUpperHalfLower
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the string to convert half upper case and half lower case: ");
   String s=sc.nextLine();

   String nstr1="";
   String nstr2="";

   char ch[]=s.toCharArray();

   ///////////////////////////////////////////////////////
   //   for converting into upper case

      for(int i=0; i<ch.length/2; i++)
      {
      	  if(ch[i]>=97 && ch[i]<=122)
      	  {
      		  nstr1=nstr1+(char)(ch[i]-32);
      	  }
      	  else
      	      nstr1=nstr1+ch[i];
     }
  ////////////////////////////////////////////////
 //    for converting into lower case

   for(int j=ch.length/2; j<ch.length; j++)
   {
	  if(ch[j]>=65 && ch[j]<=90)
	  {
		  nstr2=nstr2+(char)(ch[j]+32);
	  }
	  else
	      nstr2=nstr2+ch[j];
   }

///////////////////////////////////////////////////
    String str=nstr1+nstr2;

    System.out.println(str);
 }
}