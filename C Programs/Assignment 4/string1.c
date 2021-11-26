/*1.Write a Program to read a string and find out the length of that string by writing User defined function
Int myStrlen(int)*/


#include<stdio.h>
int main()
{
	char ch[100];
	int l;
	printf("Enter your string : ");
	scanf("%s",&ch);
	printf("\nYou have entered %s ",ch);
	l=mystrlen(ch);
	printf("\n\nLength of the String is : %d", l);
	return 0;
}
int mystrlen(char ch[])
{
	int l;
	
	while(ch[l]!='\0')
	{
		l++;
	}

	return l;
}

