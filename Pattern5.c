#include<stdio.h>
#include<conio.h>
                         /*              1
                                       1 2 3
                                     1 2 3 4 5
								   1 2 3 4 5 6 7      */
int main()                     
{
	int i,j,k;
	for(i=1;i<=7;i=i+2)
	{   
  
		for(j=83-i;j>=1;j--)
		{
			printf(" ");
		}
	 for(k=1;k<=i;k++)
	 {   
	 	printf("%d ",k);
	 }
	 printf("\n");
	}
	getch();
}
