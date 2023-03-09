import java.util.Scanner;

class Question15feb1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String div="";
		System.out.println("Enter the Roll no. : ");
		int r=sc.nextInt();
		System.out.println("Enter name of student : ");
		String s=sc.next();
		System.out.println("Enter the marks of three subject : ");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int total=s1+s2+s3;
		float per=total/3;

		if(per>=60)
			div="First";
		else if(per<60 && per>=40)
			div="Second";
		else
			div="Fail";

		System.out.println("Roll no : "+r+ "  Student name : "+s);
		System.out.println("Marks in three subjects are : "+s1+", "+s2+", "+s3);
		System.out.println("Total : "+total+"\nPercentage : "+per+"\nDivision : "+div);
	}
}

/*Write a java program to read roll no, name and marks of three
subjects and calculate the total, percentage and division.*/