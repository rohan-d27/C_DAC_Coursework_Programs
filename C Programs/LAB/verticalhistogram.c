/*print vertical histogram of array elements*/
 #include<stdio.h>
 int main()
 {
 	int i,j,n=5,max,var;
 	int arr[]={5,4,15,12,9};
 	max=arr[0];
 	for(i=0;i<5;i++)
 	{
 		if(arr[i]>max)
 		{
 			max=arr[i];
 		}
 	}
 	var=max;
 	for(j=0;j<var;j++)
	{
		for(i=0;i<n;i++)
		{
			if(arr[i]<max)
			{
				printf(" ");
			}
			else
			{
				printf("*");
			}
			
		}
 		max=max-1;
 		printf("\n");
 	}
 	printf("\n--------------");
 	printf("\n5415129");
 }
