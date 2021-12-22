#include<stdio.h>
int main()
{
	int j;
	int arr[]={12,34,50,55,43,54,60,10,9,52,-999};
	printf("arrray :\n");
	for(j=0;arr[j]!=-999;j++)
	{
		printf(" %d ",arr[j]);
    }
    maxandsecondmax(arr);
}
void  maxandsecondmax(int arr[]){
	int max,smax,i;
	max=arr[0];//always set max like this
	for(i=0;arr[i]!=-999;i++)
	{
		if(arr[i]>max)
		{
			smax=max;
			max=arr[i];
		}
		else if(arr[i]>smax)
		{
			smax==arr[i];
		}
	}
	printf("\nmax: %d",max);
		printf("\nsecond max: %d",smax);
}
    
