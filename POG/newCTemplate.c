#include<stdio.h>

int main()
{
	int i;
	int arr2[3][3]; //arr2[][3] is also valid

  
	accept_arr(arr2);
   

	print_arr(arr2);

    
	
//	show_arr(ptr);
	return 0;
}

void accept_arr(int arr[3][3])  //int arr[][3] is also valid
{
	int i,j;
	printf("Enter array element:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%d",&arr[i][j]);
		}
	}
}


void print_arr(int arr[][3])  //int **arr is also valid
{
	int i,j;
	printf("Array element:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
}


/*void show_arr(int **arr, int m, int n)  //int **arr is also valid
{
	int i,j;
	printf("Array element:\n");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d",*(*(arr+i)+j));
		}
		printf("\n");
	}
}*/
