#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k;
	for(i=1;i<=7;i=i+2)
	{   
   /*  if(i%2==0)
	     { 
	     continue;
		 }    */
		for(j=84-i;j>=1;j--)
		{
			printf(" ");
		}
	 for(k=1;k<=i;k=k+2)
	 {   
	 	printf("%d   ",i);
	 }
	 printf("\n");
	}
	getch();
}
