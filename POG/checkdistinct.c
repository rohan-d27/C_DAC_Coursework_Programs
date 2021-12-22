#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter size of array:");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{	printf("Enter elements: ");
		scanf("%d",&arr[i]);
	}
	printf("arrray :\n");
	for(j=0;j<n;j++)
	{
		printf(" %d ",arr[j]);
    }
   int  x=AllDistinct(arr,n);
    if(x==0)
    {
    	printf("\nArray elements are distinct");
    }
    else
   {
   	printf("\nArray elements are not Distinct");
   } 
    return 0;
}
int AllDistinct(int arr[],int n)
{
	int i,j,flag;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			
			if(arr[i]==arr[j])
			{
		     	return 1;
			}	
		}
	}

	return 0;
}
