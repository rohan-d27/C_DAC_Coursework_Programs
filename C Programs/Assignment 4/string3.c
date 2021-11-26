/*3.Write a program to read a string and reverse the string.*/


#include<stdio.h>
int main()
{
	int myStrlen(char *);
	void swap(char*,char*);
	char ch[50];
	printf("Enter string ");
	scanf("%s",ch);
	char *sptr = ch;
	char *eptr=(ch + myStrlen(sptr))-1;
	while(eptr>sptr)
	{
		swap(sptr,eptr);
		sptr=sptr+1;
		eptr=eptr-1;
	}
	printf("\nreversed string is %s ",ch);
	return 0;
}
int myStrlen(char *length)
{
	int i,counter = 0;
	while(*length !='\0')
	{
		counter = counter +1;
		length = length + 1;	
	}
	return counter;
}
void swap(char* sptr,char* eptr)
{
	char temp;
	temp  = *sptr;
	*sptr = *eptr;
	*eptr = temp;
}
