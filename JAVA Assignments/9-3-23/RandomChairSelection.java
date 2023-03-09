import java.util.Random;
import java.util.Scanner;


class RandomChairSelection
{
  static int nonRepetive()
  {
   Random ran=new Random();
   int random=1,previous=1;

   while(true)
   {
   random = ran.nextInt(7);
   System.out.println(random);
   if(random!=previous && random!=0)
   {
     return random;
   }
   else
   {
     return -1;
   }
  }
 }

public static void main(String[] args)
{
  int num=nonRepetive();
  System.out.println("random "+num);

  int arr[][]={
		{1,1,2,3,4,5,6,7,8,9,10,11,12,13},
		{2,2,4,6,8,10,12,1,3,5,7,9,13,11},
		{3,13,12,11,10,9,8,6,7,4,5,3,2,1},
		{4,3,5,7,9,11,13,12,10,8,6,4,1,2},
		{5,4,8,12,3,7,11,2,6,10,13,1,9,5},
		{6,5,10,2,7,12,4,9,13,6,1,8,11,3},
		{7,7,13,9,1,3,2,10,5,11,4,12,8,9}
	      };

  String s[]={"Null","a1","a2","a3","a4","a5","a6","a7","a8","a9","a10","a11","a12","a13"};

  for(int i=0;i<7;i++)
  {
   if(arr[i][0]==num)
   {
    for(int j=1;j<14;j++)
    {
     int temp=arr[i][j];
     System.out.println(s[j]+ " -> "+temp);
     }
    }
   }
  }
}