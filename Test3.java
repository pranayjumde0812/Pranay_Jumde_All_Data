import java.util.Scanner;

class Test3
{
  public static void main(String [] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter 4 number");
   double a=sc.nextDouble();
   System.out.print("a= "+a);
   double b=sc.nextDouble();
   System.out.print("b= "+b);
   double c=sc.nextDouble();
   System.out.print("c= "+c);
   double d=sc.nextDouble();
   System.out.print("d= "+d);

   double max,min,diff;
   if(a>b && a>c && a>d)
   {
	  max=a;
   }
   else if(b>a && b>c && b>d)
         {
   	       max=b;
          }
    else if(c>a && c>b && c>d)
	         {
	   	       max=c;
          }
          else{
			  max=d;
		  }

    if(a<b && a<c && a<d)
	   {
		  min=a;
	   }
	   else if(b<a && b<c && b<d)
	         {
	   	       min=b;
	          }
	    else if(c<a && c<b && c<d)
		         {
		   	       min=c;
	          }
	          else{
				  min=d;
		  }

     diff = max-min;
     System.out.println();
     System.out.println("Difference of two no = "+diff
     );
  }
}