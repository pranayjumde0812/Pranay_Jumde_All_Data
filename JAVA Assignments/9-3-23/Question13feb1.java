/*Write a C program to find the eligibility of admission for a
professional course based on the following criteria:
Marks in Maths >=65
Marks in Phy >=55
Marks in Chem>=50
Total in all three subject >=180
or
Total in Math and Physics >=140*/
import java.util.Scanner;
class Question13feb1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks obtained in Physics : ");
		int p=sc.nextInt();
		System.out.println("Enter marks obtained in Chemistry : ");
		int c=sc.nextInt();
		System.out.println("Enter marks obtained in Mathematics : ");
		int m=sc.nextInt();
		System.out.println("Total marks obtained in Physics, Mathematics and Chemistry : "+(m+p+c));
		System.out.println("Total marks obtained in Physics and Mathematics : "+(m+p));

		if(m>=65 && p>=55 && c>=50 &&((m+p+c)>=180 || (m+p>=140)))
		{
			System.out.println("The candidate is eligible for admission ");
		}
		else
			System.out.println("Candidate is not eligible ");

	}
}



