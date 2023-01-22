import java.util.Scanner;

//18th Jan Assignment(Que-9)

class EquationQue9{

 public static void main(String [] args){

 int count, n;
 float x,y;
  System.out.println("Enter the value of x and n:");
  Scanner sc=new Scanner(System.in);

  x=sc.nextFloat();
  n=sc.nextInt();
  System.out.println("x = "+x);
  System.out.println("n = "+n);

  y=1;
  count=1;

  while(count<=n){
	  y=y*x;
	  count++;
  }

System.out.println("y=x^n equation is  y= "+y);
 }

}