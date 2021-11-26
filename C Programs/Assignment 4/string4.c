/*4.Writa a Program  to read a string and count the number of upper case & lower case letter in that string.*/



#include<stdio.h>
int main()
{
	char ch[100];
	printf("Enter your string : ");
	scanf("%s",&ch);
	printf("\n\nYou have entered %s ",ch);
     countul(ch);

	return 0;
}
void countul(char *ch)
{
	int i,u=0,l=0,s;
	s=mystrlen(ch);
	for (i=0;i<s;i++)
	{
		if(ch[i]>=65&&ch[i]<=90)
		{
		   u++;
		}
		else if(ch[i]>=97&&ch[i]<=122)
		{
		    l++;	
		}
	}
	printf("\n\nthere are %d upper case letters",u);
	printf("\n\nthere are %d lower case letters",l);
	
	
}
int mystrlen(char ch[])
{
	int s=0;
	
	while(ch[s]!='\0')
	{
		s++;
	}
	return s;
}

