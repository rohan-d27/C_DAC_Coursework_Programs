#include<stdio.h>
#include<unistd.h>
void main()
{
	int return_value=fork();
	if(return_value>0)
	{
		fork();
		printf("test1\n");
	}
	else
	{
		printf("test2\n");
	}
}

