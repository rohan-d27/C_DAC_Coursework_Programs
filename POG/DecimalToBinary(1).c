#include<stdio.h>
long convertTObin(int num);

int main(void)
{
	int x = 300;
	long res = convertTObin(x);
	printf("%ld ",res);
	
}

long convertTObin(int num)
{
	long int a=1,binary = 0, rem;
	while(num>0)
	{
		rem=num%2;
		binary = binary + rem*a;
		a= a*10 ;
		num=num/2;
	}
	return binary;
}
