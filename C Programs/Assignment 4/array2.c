/*write a program to get array*/


#include<stdio.h>
int main()
{
	int arr[5],i;
	void display(int []); //passing array using subscript notation
	printf("Enter elements of array");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}
	display(arr);
}
void display(int arr[]) //defination
{
	int i;
	printf("\n Entered elements are..");
	for(i=0;i<=4;i++)
	{
		printf("\t%d",arr[i]);
	}
}
