#include<stdio.h>
int main(){
	int arr[]={12,14,16,20,23,24,5,6,8,10};
	int low=0,high=9,mid,key=24;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(key==arr[mid]) break;
		else if (arr[low]<=arr[mid])
		if((key>=arr[low])&&(key<arr[mid]))
		high=mid-1;
		else
		low=mid+1;
		else if((key>arr[mid])&&(key<=arr[high]))
		low=mid+1;
		else
		high=mid-1;	
	}
	if(key==arr[mid])
	printf("\nFound at %d position",mid);
	else
	{
		printf("\n not found");
	}
}
