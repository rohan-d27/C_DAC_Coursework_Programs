/*8.Write a Program to read 5 numbers in array and a number & 
find out no of occurrences of that number in the array.*/


#include<stdio.h>
int main()
{
	int key,arr[5];
	int count;
	read_array(arr);
	display(arr);
	printf("\nEnter a number of which occurance to find  \n");
	scanf("%d",&key);
	search(arr,&key);
	
	return 0;
	
	
}
void read_array(int arr[])
{
	int i;

	printf("\n\nEnter elements of the array \n");
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
void search(int arr[],int *key)
{
	int i;
	int count=0;
	for(i=0;i<=4;i++)

	{
		if(arr[i]==*key)
		{
			count++;
		}
	}
	printf("\n\nthe number has occured %d times",count);

}
