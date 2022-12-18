#include<stdio.h>
#include<conio.h>
int main()
{    
    int a=65,i,j;
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=5;j++)
		{
			if(j==1)
			{
			 printf("%c",a);
			}
			else{
				printf("%c",a+32);
			}
		}
		   a++;
		   printf("\n");
	}
	getch();
}
