/*1. Accept array elements of 5 integers and
 find sum of array elements and display it.*/
 
 #include<stdio.h>
 int main()
 {
 	int arr[5],s=0;
 	read_array(arr);
 	printf("\n\nArray elements are ");
 	display(arr);
 	sum(arr,&s);
 	printf("\n\nSum is %d",s);
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
void sum(int arr[],int *s)
{
	int i;
	for(i=0;i<=4;i++)
	{
		*s=*s+arr[i];
	}
}
