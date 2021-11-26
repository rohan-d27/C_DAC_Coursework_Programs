
#include <stdio.h>

void print_array(int *mark)
{
	printf("**** Array Values *****\n");
 	printf("print_array size of mark=%d\n", sizeof(mark) );
	int i=0;
	for(i=0; i<5; i++)
	{
		printf("%d\n", mark[i]);
	}
	printf("***********************\n");
}

int sum_of_all_values(int amark[5])
{
	int sum=0, i=0;
	for(i=0; i<5; i++)
	{
		sum = sum + amark[i];
	}
	return sum;
}

int avg_of_all_values(int amark[5])
{
	int sum = sum_of_all_values(amark);
	return (sum/5);	
}

int main()
{
	int mark[5];

	printf("size of mark=%d\n", sizeof(mark) );
	printf("Enter any 5 numbers:\n");
	
	int i=0;
	for(i=0; i<5; i++)
	{
		scanf("%d", &mark[i]);
	}	

	print_array(mark);
	
	printf("SUM=%d\n", sum_of_all_values(mark));

	printf("AVG=%d\n", avg_of_all_values(mark));
	return 0;
}






























