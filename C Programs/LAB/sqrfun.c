#include<stdio.h>
int main()
{
	int num;
	printf("Enter a number to get square");
	scanf("%d",&num);
	printf("\nSquare of number is :%d",sqr(num));
	return 0;
}
	int sqr(num)
{
	num=num*num;
	return num;
}