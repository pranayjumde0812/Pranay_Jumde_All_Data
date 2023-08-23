package Code;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the square root of it : ");
        int num=sc.nextInt();
        System.out.format("Square root of "+num+" is %.3f",Math.sqrt(num));
        System.out.println();
    }
}
