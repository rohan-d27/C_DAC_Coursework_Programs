
#include <stdio.h>

void print_array(int *amark)
{
	printf("**** Array Values *****\n");
 	printf("print_array size of amark=%d\n", sizeof(amark) );
	int i=0;
	for(i=0; i<5; i++)
	{
		printf("%d\n", amark[i]);
	}
	printf("***********************\n");
	
	amark[3] = 999;
}

void print_num(int anum)
{
	printf("Num=%d\n", anum);
	anum=50;
}

int main()
{

	int mark[5] = {7,6,5,4,3};
	int num=10;

	printf("size of mark=%d\n", sizeof(mark) );
	printf("size of num=%d\n", sizeof(num) );

	print_array(mark);
	print_num(num);
	print_array(mark);
	print_num(num);
	
	return 0;
}
