#include<stdio.h>
#include<conio.h>
int main()
{    int i,j;
	for(i=69;i>=65;i--)
	{	if(i==67)
			{
			continue;
			}
		for(j=1;j<=5;j++)
		{
			
			printf("%c",i);
			
		}
		printf("\n");
	}
	getch();
}
