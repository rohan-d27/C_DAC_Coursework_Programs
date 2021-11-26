/*Write a function to convert Upper Case character t Lower Case character*/


#include<stdio.h>

void toLower(char);
   
    int main()
{
	char ch;
	printf("Enter a Upper Case character - ");
	scanf("%c",&ch);
	toLower(ch);
	
	return 0;
}
    void toLower(char ch)
{
	if(ch>=65 && ch<=90)
	{
		ch=ch+32;
		printf("lower case character is %c",ch);
	}
	else
	{
		printf("Enter valid character");
	}
}
