#include<stdio.h>
#include<conio.h>
int main()
{
	int n=1;
	float s=0,i;
	for(i=1;i<=7;i=i+2)
	{
		s=s+(i/n);
		n=n*2;
	}
	printf("%f ",s);
}
