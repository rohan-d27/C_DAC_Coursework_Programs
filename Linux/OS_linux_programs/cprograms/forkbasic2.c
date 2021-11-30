#include<stdio.h>
#include<unistd.h>
int main()
{
	int x=0;
	fork();
		while(x++<10)
		{
			printf("pid=%d ,ppid=%d \n",getpid(),getppid());
		}
		return 0;
}
