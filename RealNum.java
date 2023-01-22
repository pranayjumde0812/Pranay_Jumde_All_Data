import java.util.Scanner;
class RealNum{

// 18th Jan 2023 (Question 4)

 public static void main(String [] args){

 Scanner sc =new Scanner(System.in);
 System.out.println("Enter Four Real Number:");
 double a=sc.nextDouble();
 System.out.println("a = "+a);
 double b=sc.nextDouble();
 System.out.println("b = "+b);
 double c=sc.nextDouble();
 System.out.println("c = "+c);
 double d=sc.nextDouble();
 System.out.println("d = "+d);

 double min,max,diff;

// To find Maximum Number
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
  else
  {
	max=d;
  }

  // To find Minimum Number
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
    else
    {
  	  min=d;
    }

  diff=max-min;
  System.out.println();
  System.out.println("Difference of maximum and minimum real number = "+diff);
 }
}