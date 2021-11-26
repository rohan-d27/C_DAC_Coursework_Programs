/*write a program to get array*/


#include<stdio.h>
int main()
{
	int arr[5],i;
//	void display(int []); //passing array using subscript notation
	
//	void display(int *);
	read_array(arr);
	display(arr);  //call
	//display(&arr[0]); // also valid call
	//display(arr+0); //also valid
}
 void display(int *arr)
 {
 	int i;
	printf("\n Entered elements are..");
	for(i=0;i<=4;i++)
	{
		printf("\t%d",arr[i]);
	}
 }
/*void display(int arr[]) //defination
{
	int i;
	printf("\n Entered elements are..");
	for(i=0;i<=4;i++)
	{
		printf("\t%d",arr[i]);
	}
}*/
void read_array(int arr[])
{
	int i;
	printf("Enter elements of array");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}
}
