/*Write a fuction to take array from user and return even and odd elements*/


#include<stdio.h>
int main()
{
	 int arr[5],even[5],odd[5];
	 read_array(arr);
	 printf("Array elements are\n ");
	 display(arr);
	 odd_even(arr,even,odd);
	 printf("\nEven elements are\n ");
	 display(even);
	 printf("\nOdd elements are\n ");
	 display(odd);
	 return 0;
}
void read_array(int arr[])
{
	int i;
	printf("Enter elements of the array ");
	for(i=0;i<=4;i++)
	{
		scanf("%d",&arr[i]);
	}	
}

void display(int arr[])
{
	int i;
	for(i=0;i<=4 && arr[i]!=-9999;i++)
	{
	printf("%d\t",arr[i]);
    }
}

void odd_even(int arr[],int even[],int odd[])
{
	int i,e=0,o=0;
	for(i=0;(arr[i]!=-9999)&&(i<=4);i++)
	{
		if(arr[i]%2==0)
		{
		  even[e]=arr[i];
		  e++;	
		}
		else
		{
			odd[o]=arr[i];
			o++;
		}
		even[e]=-9999;
		odd[o]=-9999;
	}
}
