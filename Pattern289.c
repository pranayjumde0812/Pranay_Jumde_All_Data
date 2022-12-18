#include<stdio.h>
#include<conio.h>
int main()
{    
    int i,j;
	for(i=65;i<=68;i++)
	{
		for(j=65;j<=68;j++)
		{
			if(j<=i)
			{
			  printf("%c ",j);
			}	
		}
		printf("\n");
	}
	getch();
}
