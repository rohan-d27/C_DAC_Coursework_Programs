/*write a program to get array*/


#include<stdio.h>
int main()
{
	int arr[5],i;
	printf("Enter elements of array");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n Entered elements are..");
	for(i=0;i<=4;i++)
	{
		printf("\t%d",arr[i]);
	}
}
