/*3.Accept an array from user in main and each array element is multiplied by 5.
Display entire array  using function.*/

#include<stdio.h>
int main()
{
	int arr[5];
	read_array(arr);
	printf("\nArray elements are: ");
	display(arr);
	div(arr);
	printf("\n\nArray elements after multiplying by 5 are: ");
	display(arr);
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
	for(i=0;i<=4 && arr[i]!=-9999;i++)
	{
	printf("%d\t",arr[i]);
    }
}
void div(int arr[])
{
	int i;
	for(i=0;i<=4;i++)
	{
		arr[i]=arr[i]*5;
	}
}

