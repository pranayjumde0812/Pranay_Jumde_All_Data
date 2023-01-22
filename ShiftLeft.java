import java.util.Scanner;
class ShiftLeft{

// 18th Jan 2023 (Question 2)

 public static void main(String [] args){

 Scanner sc =new Scanner(System.in);
 System.out.print("Enter the number: ");
 int x=sc.nextInt();
  System.out.println("Number Before 2 bits shifting to left");
  System.out.println("x= "+x);

     x= x << 2;        // for left shifting

    //  x= x >> 2;    // for right shifting


  System.out.println("Number after shifting 2 bits to left");
  System.out.println("x= "+x);

 }
}