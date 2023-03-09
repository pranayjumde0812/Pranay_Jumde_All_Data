import java.util.Scanner;

class Prime_Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		System.out.println("Prime Factors are : ");
		for(int i=2;i<num;i++)
		{
			while(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
		}

		if(num>2)
		{
			System.out.println(num);
		}
	}
}

/*WAP in java to find Prime factors of number
AT the end number have only 1 and prime number as a factor*/