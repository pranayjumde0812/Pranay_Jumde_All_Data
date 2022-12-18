#include<stdio.h>
#include<conio.h>
#include <iostream>
using namespace std;
#include<string.h>
int main()
{   int c1,c2,i=0;
	char user[10]={"pranay12"}, upass[10]={"Pranay"}, userk[10],upassk[10],ch;
	
	
	cout<<"enter username: ";
	cin>>userk;
	cout<<"enter password: ";
	do
	{   
	    ch=getch();
	    upassk[i]=ch;
		cout<<"*";
			i++;
	}
	 
	 while(ch!='\r');
    upassk[i-1]='\0';
    
	c1=strcmp(user,userk);
	c2=strcmp(upass,upassk);
	
	if(c1==0 && c2==0)
	{
		cout<<endl<<"welcome to Apna Bank"<<endl;
	}else
	    cout<<endl<<"Invalid Credentials";
}
