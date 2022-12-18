#include<stdio.h>
#include<conio.h>
int main()
{
	int a=65,i,j;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=5;j++)
		{
			printf("%c",a);
			a++;
		}
		a=65;
		
		printf("\n");
	}
	getch();
}
