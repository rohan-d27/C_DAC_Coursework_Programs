#include<stdio.h>
#include<limit.h>		//initialize smax with smax = INT_MIN ;
int main(void)
{
	largest and second largest element in an array;
	
	arr[]={12,34,50,55,54,55,43,60,10,9,52,-999};
	int max , smax , i ;
	
	max = arr[0];
	for( i=1 ; arr[i]!=-999 ; i++)
	{
		if(arr[i]>max)
		{
			smax = max;
			max = arr[i];	
		}
		else if (arr[i]>smax)
		{
			smax = arr[i];
		}
	}
}

/*
in java 
Byte.MAX_VALUE
INTEGER.MIN_VALUE
