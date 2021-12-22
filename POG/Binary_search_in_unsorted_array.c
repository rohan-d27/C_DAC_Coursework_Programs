//WAP to perform binrary search on an array to search a value. the array is sorted but rotated by n number of times.
//input arr[] = {12,14,16,20,23,24,5,6,8,10}
//key = 20
/* low = 0;high = 9 ; mid = 4;
if arr[low] < arr[mid] ..then increase mid by 1.
*/
#include <stdio.h>
int main(void)
{
	int arr[] = {12,14,16,20,23,24,5,6,8,10};
	int low =0 , high = 9 , mid , key = 6;
	while (low <= high)
	{
		mid = (low + high )/2;
		if(key == arr[mid]) break;
		else if (arr[low]<=arr[mid])
		{
			if((key>=arr[low])&&(key<arr[mid]))
				high = mid - 1;
			else low = mid + 1 ;
		}
		else if ((key >arr[mid])&&(key<=arr[high]))
		{
			low = mid + 1;
		}
		else high = mid - 1 ;
	}
	
	if (key == arr[mid])
	printf("Found at %d position ",mid+1);
	else 
	printf("key not Found ");
}


/*

int AllDistinct (int arr[])
{
	int i ,j ;
	for(i=0;arr[i+1]!=-999;i++)
		for(j=i+1;arr[j]!=-999;j++)
			if(arr[i] == arr[j]) return 0;
			return 1;
}
