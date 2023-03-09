import java.util.Scanner;

class ArrangeEvenOdd{
 public static void main(String [] args){

 int count=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter size of array greater than 2");
 int n=sc.nextInt();
 int arr[]=new int[n];
 int narr[]=new int[arr.length];

 for(int i=0; i<arr.length;i++){

   arr[i]=sc.nextInt();
   }

 for(int i=0;i<arr.length;i++)
 {
	 if(arr[i]%2==0)
	 {
		 narr[count]=arr[i];
		 count++;
	 }
 }

for(int i=0;i<arr.length;i++)
 {
	 if(arr[i]%2==1)
	 {
		 narr[count]=arr[i];
		 count++;
	 }
 }
for(int i=0; i<narr.length;i++){

   System.out.print(narr[i]+" ");
   }

 }
}