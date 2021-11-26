/*2. Accept an array of 5 elements and 
create its reverse in same array and then print the array.*/

#include<stdio.h>
int main()
{
	int arr[5],brr[5];
	read_array(arr);
	printf("\nEntered array is \n");
	display(arr);
	reverse(arr,brr);
	printf("\n\nAfter reverse array is ");
	display(brr);
	return 0;
	
	
}
void read_array(int arr[])
{
	int i;
	printf("Enter elements of the array \n");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}	
}

void display(int arr[])
{
	int i;
	for(i=0;i<=4;i++)
	{
	printf("%d\t",arr[i]);
    }
}
void reverse(int arr[],int brr[])
{
	int i,e=4;
	for(i=0;i<=4;i++)
	{
		brr[e]=arr[i];
		e--;
	}
}
