#include<stdio.h>
#define MAX 50
int main()
{
	int arr[MAX]={2,3,3,4,4,4,6,6,6,6,7,-999};
	printf("Original element array: ");
    int i,j;
	for(i=0;arr[i]!=-999;i++)
	{
		printf(" %d  ",arr[i]);
	}
	removeDuplicates(arr);	
	printf("\nUnique element array: ");
    for(j=0;arr[j]!=-999;j++)
	{
		printf(" %d  ",arr[j]);
	}
	return 0;
	
}
void removeDuplicates(int arr[])
{
	int i,k,n_dup=0,dup=0;
	for(i=0;arr[i]!=-999;i++)
	{
		if(arr[i]==arr[i+1])
			{
				k=i+1;
				while(arr[k]!=-999&&(arr[k]==arr[k+1]))
				k++;
				n_dup=k-i;
				dup=dup+1;
				for(k=i;arr[k]!=-999;k++)
				{
					arr[k]=arr[k+n_dup];
				}
			}
	}
}
