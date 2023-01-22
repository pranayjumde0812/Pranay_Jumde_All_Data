import java.util.Scanner;
class ReverseNum{

// 18th Jan 2023 (Question 3)

 public static void main(String [] args){

 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the number to be reverse: ");
 int n=sc.nextInt();
 int y=0;

  while(n>0){

	 int x=n%10;
     y=y*10+x;
     n=n/10;
  }
  System.out.println("Number After reversing = "+y);
 }
}