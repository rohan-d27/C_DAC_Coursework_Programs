/*Write a function to take a number and return its square*/


#include<stdio.h>

void find_square(int);

int main()
{
	int num;
	printf("Enter a number to get square - ");
	scanf("%d",&num);
	find_square(num);
	return 0;
}
	void find_square(int num)
{
	num=num*num;
    printf("Square of given number is %d ",num);
}
