/*Q2.Wite a function to calculate sum of 1 to 10 numbers and display the result in main(). (Do not use return statement)*/


#include<stdio.h>
int main()
{
	int sum=0;
	sumof(&sum);
	printf("Sum of 1 to 10 numbers is %d ",sum);
	return 0;
}

void sumof(int *sum)

{   int i;
	for (i=0;i<11;i++)
	{
		*sum=*sum+i;
	}
}
