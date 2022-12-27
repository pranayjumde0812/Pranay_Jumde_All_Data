#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k;
	for(i='A';i<='G';i=i+2)
	{   
  
		for(j=150-i;j>=1;j--)
		{
			printf(" ");
		}
	 for(k=i;k>='A';k--)
	 {   
	 	printf("%c ",k);
	 }
	 printf("\n");
	}
	getch();
}
