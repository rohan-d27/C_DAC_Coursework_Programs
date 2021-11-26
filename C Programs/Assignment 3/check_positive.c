/*Write a function to accept number from user and display if it is positve or negative*/


#include<stdio.h>

void check_positive(int);

int main()
{
	int num;
	printf("Enter a number - ");
	scanf("%d",&num);
	check_positive(num);
	return 0;
}
void check_positive(int num)
{
	if(num>0)
	{
		printf("Number is positive");
	}
	else if(num<0)
	{
		printf("Number is negative");
	}
	else if(num==0)
	{
		printf("Number is zero");
	}
}
