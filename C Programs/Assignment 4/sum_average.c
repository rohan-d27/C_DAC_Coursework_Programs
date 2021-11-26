/*5.Write a Program to read 5 numbers in the array and 
find out sum and average of those numbers.*/


 #include<stdio.h>
 int main()
 {
 	int arr[5],s=0,a=0;
 	read_array(arr);
 	printf("\n\nArray elements are ");
 	display(arr);
 	sum(arr,&s);
 	average(&s,&a);
 	printf("\n\nSum is %d",s);
 	printf("\n\nAverage is %d",a);
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
void average(int *s,int *a)
{
	*a=*s/5;
}
