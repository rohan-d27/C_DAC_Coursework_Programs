
#include <stdio.h>

void print_array(int *input_array, int array_size)
{
	printf("**** Array Values *****\n");
 	int i=0;
	for(i=0; i<array_size; i++)
	{
		printf("%d\n", input_array[i]);
	}
	printf("***********************\n");
}

void populate_array(int *input_array, int array_size)
{
	printf("Enter %d numbers:\n", array_size);
 	int i=0;
	for(i=0; i<array_size; i++)
	{
		scanf("%d", &input_array[i]);
	}
}

void get_sq_of(int *input_array, int *output_array, int array_size)
{
	int i=0;
	for(i=0; i<array_size; i++)
	{
		output_array[i] = input_array[i] * input_array[i];
	}
}

int main()
{
	int arr[5];
	int brr[3];

	populate_array(arr, 5);
	populate_array(brr, 3);
	print_array(arr, 5);
	print_array(brr, 3);
	
	int sarr[5] = {0};
	get_sq_of(arr, sarr, 5);
	print_array(sarr, 5);

	return 0;
}