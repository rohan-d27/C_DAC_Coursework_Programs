/* Write a program to print maximum and minimum values from 15 numbers.Take input from user*/

#include<stdio.h>
int main()
{
	int  num,max,min,i;
	printf("\n Enter a number:");
	scanf("%d",&num);
	max=num;
	min=num;
	for(i=2;i<=15;i++)
	{
		printf("\n Enter a number:");
		scanf("%d",&num);
		if(num>max)
		{
			max=num;
		}
		if(num<min)
		{
			min=num;
		}	
	}
		printf("\nMax=%d",max);
		printf("\nMin=%d",min);	
		
	return 0;
}

