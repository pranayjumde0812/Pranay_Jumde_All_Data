#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k;
	for(i=65;i<=71;i=i+2)
	{   
  
		for(j=150-i;j>=1;j--)
		{
			printf(" ");
		}
	 for(k=65;k<=i;k++)
	 {   
	 	printf("%c ",k);
	 }
	 printf("\n");
	}
	getch();
}
