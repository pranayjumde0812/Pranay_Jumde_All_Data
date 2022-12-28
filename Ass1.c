#include<stdio.h>
#include<conio.h>
int main()
{
	int n=1;
	float s=0,i;
	for(i=1;i<=50;i++)
	{
		s=s+(1/i);
	}
	printf("%f ",s);
}
