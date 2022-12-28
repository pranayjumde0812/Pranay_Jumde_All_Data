#include <stdio.h>
int main() 
{
	int n[5], i, x,j;
	printf("Input the first number of the array:\n");

	scanf("%d", &x);
	for(i = 0; i < 5; i++) 
	{
		n[i] = x;
		x = 3*x;
	}

	for(j = 0; j < 5; j++)
	{
		printf("n[%d] = %d\n", j, n[j]);
	}
	return 0;
}


