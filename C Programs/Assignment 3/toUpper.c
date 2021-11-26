/*Write a function to convert lower case letter to Upper case letter*/


#include<stdio.h>

void toUpper(char);

int main()
{
	char ch;
	printf("Enter a  lower case character - \n");
	scanf("%c",&ch);
	toUpper(ch);
	return 0;
}
    void toUpper(char ch)
    {
	if(ch>=97 && ch<=122)
	{
		ch=ch-32;
		printf("Upper case character is %c ",ch);
	}
	else
	{
		printf("Enter valid character");
	}
}
