import java.util.Scanner;

class Feb_16_Q6
{
 public static void main(String [] args)
 {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee ID : ");
    int emp_id=sc.nextInt();
    System.out.println("Enter total worked hours of a month : ");
    float work_hr=sc.nextFloat();
    System.out.println("Enter the amount recived per hour : ");
    float aph=sc.nextFloat();

    float salary =work_hr*aph;

    System.out.println("Employee Id is : "+emp_id);
    System.out.println("Salary of this month = "+salary);


 }
}