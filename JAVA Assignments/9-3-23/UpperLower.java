import java.util.Scanner;

class UpperLower
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any String");

  int upper=0,lower=0,dg=0,spc=0,sp_char=0;

  String s=sc.nextLine();

  char ch[]=s.toCharArray();

  for(int i=0; i<ch.length; i++)
  {
	if(ch[i]>='A' && ch[i]<='Z')
	{
	  upper++;
	}
	else if(ch[i]>='a' && ch[i]<='z')
	{
      lower++;
	}
	else if(ch[i]>='0' && ch[i]<='9')
    {
	  dg++;
	}
	else if(ch[i]==' ')
	{
	  spc++;
	}
	else
	{
	  sp_char++;
	}
  }
 System.out.println("Count of upper case = "+upper);
 System.out.println("Count of lower case = "+lower);
 System.out.println("Count of Digits = "+dg);
 System.out.println("Count of spaces  = "+spc);
  System.out.println("Count of Special char = "+sp_char);



 }
}