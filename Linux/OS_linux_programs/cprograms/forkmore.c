#include<stdio.h>
#include<unistd.h>
void main()
{
	int return_value_of_fork;
	return_value_of_fork=fork();
	if(return_value_of_fork>0)
	{
		while(1)
		{
			printf("Hi pid=%d,ppid=%d \n",getpid(),getppid());
	printf("return value of fork =%d \n",return_value_of_fork);
	sleep(2);	}
	}
	if(return_value_of_fork==0)
	{
		while(1)
		{
			printf("Hello pid=%d,ppid=%d \n",getpid(),getppid());
		printf("return value of fork=%d\n",return_value_of_fork);
		sleep(2);
			}
	}
}

