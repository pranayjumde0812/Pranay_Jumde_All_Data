import java.util.Scanner;

class XYZvalue
{
 public static void main(String [] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter three X Y and Z value");
 int x=sc.nextInt();
 int y=sc.nextInt();
 int z=sc.nextInt();

System.out.println("X = "+x);
System.out.println("Y = "+y);
System.out.println("Z = "+z);

  int op1,op2;

  op1=(x+y)*z;

  op2=(x*y)+(y*z);

  System.out.println("(x+y)*z = "+op1);
  System.out.println("x*y + y*z = "+op2);


 }
}