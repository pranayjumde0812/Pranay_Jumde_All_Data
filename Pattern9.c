#include<stdio.h>
#include<conio.h>
         
	      /*        0
	              1 0 1
	            2 1 0 1 2
	          3 2 1 0 1 2 3    */
int main()
{
	 int h,space,str,n=0,m;
	 for(h=1;h<=7;h=h+2)
	 {
	 	for(space=1;space<=83-h;space++)
	 	{
	 	  printf(" ");	
		}
		m=n;
		for(str=h;str>0;str--)
		{
			if(m<0)
			{
				printf(" %d",-m);
				m--;
			}
			else
	    	{
			printf(" %d",m);
			m--;
	    	}
		}
		printf("\n");
		n++;	  
	 }
	   getch();          
}
