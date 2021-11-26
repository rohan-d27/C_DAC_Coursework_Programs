/*left shift elements of array*/


#include<stdio.h>
int main()
{
	int i,arr[5],brr[4];
	read_array(arr);
	printf("original array is\n");
	display(arr);
	left_shift(arr,brr);
	printf("\nafter left shift array is");
	display(brr);
	
}
void read_array(int arr[])
{
	int i;
	printf("Enter elements of the array ");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}	
}
 void display(int arr[])
{
	int i;
	for(i=0;i<=4&&arr[i]!=-9999;i++)
	{
		printf("%d\t",arr[i]);
	}
}
void left_shift(int arr[],int brr[])
{
	int i,b=0;
	for(i=1;i<=4;i++) //&&arr[i]!=-9999
	{
		brr[b]=arr[i];
		b++;
	}
	brr[b]=-9999;

}

