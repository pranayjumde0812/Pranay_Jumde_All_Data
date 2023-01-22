import java.util.Scanner;

class Multiplication3Num{

public static void main(String[] args){

  System.out.print("Enter the three Numbers: ");

  Scanner sc = new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();

  System.out.println("The Multiplication of 3 Num = "+a*b*c);
 }
}