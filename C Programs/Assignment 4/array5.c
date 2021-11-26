/*Accept two arrays with 10 
elements each and add them and 
store it in third array and print the third array
Write a function add to do the addition of array elements.*/

#include<stdio.h>
int main()
{
	int arr[5],brr[5],crr[5];
	read_array(arr);
	printf("\n\nArray1 is ");
	display(arr);
	read_array(brr);
	printf("\n\nArray2 is ");
	display(brr);
	add_array(arr,brr,crr);
	printf("\n\n\nAddition of array is ");
	display(crr);
	return 0;
	
}
void read_array(int arr[])
{
	int i;
	printf("\n\n\nEnter elements array ");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	
	}
}
void display(int arr[])
{
	int i=0;
	for(i=0;i<=4;i++)
	{
	printf("%d\t",arr[i]);
   }
}
void add_array(int arr[],int brr[],int crr[])
{
	int c=0,i=0;
	for(i=0;i<=4;i++)
	{
		crr[c]=arr[i]+brr[i];
		c++;
	}
}

