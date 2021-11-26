/*9. Accept an array of 10 elements and accept a 
number from user search a number in an array and
 print at which location number is found.
if not present in an array then print not found. 
Write a function search 
to search the element in the array.*/

#include<stdio.h>
int main()
{
	int key,arr[10];
	int count;
	read_array(arr);
	display(arr);
	printf("\nEnter a number to find  \n");
	scanf("%d",&key);
	search(arr,&key);
	
	return 0;
	
	
}
void read_array(int arr[])
{
	int i;

	printf("\n\nEnter elements of the array \n");
	for(i=0;i<=9;i++)
	{
		scanf("%d",&arr[i]);
		
	}	
}

void display(int arr[])
{
	int i;
	for(i=0;i<=9;i++)
	{
	printf("%d\t",arr[i]);
    }
}
void search(int arr[],int *key)
{
	int i;

	for(i=0;i<=9;i++)

	{
		if(arr[i]==*key)
		{
		  printf("number  %d found at location %d",*key,i);
		}
}
}
