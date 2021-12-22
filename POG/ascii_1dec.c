#include<stdio.h>
int main()
{
	char str[50];
	int i;
	printf("\n Enter a string: ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		printf("\n %c - %d",str[i],str[i]);
	}
	return 0;
}
