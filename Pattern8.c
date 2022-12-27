#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k;
	for(i=1;i<=7;i=i+2)
	{   
  
		for(j=83-i;j>=1;j--)
		{
			printf(" ");
		}
	 for(k=i;k>=1;k--)
	 {   
	 	printf("%d ",k);
	 }
	 printf("\n");
	}
	getch();
}
