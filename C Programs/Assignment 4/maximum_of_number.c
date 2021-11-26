/*6.Write a Program to read 5 numbers in the array and find out max between them.*/


#include<stdio.h>
 int main()
 {
 	int arr[5],m=0;
 	read_array(arr);
 	printf("\n\nArray elements are ");
 	display(arr);
 	max(arr,&m);
 	printf("\n\nlargest number is %d",m);
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
void max(int arr[],int *m)
{
	int i;
	*m=arr[0];
	for(i=1;i<=4;i++)
	{
		if(arr[i]>*m)
		{
			*m=arr[i];
		}
	
	}
}
