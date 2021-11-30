
#include<stdio.h>
#include<unistd.h>
int main()
{
	int x=0;
	while(x++<11)
	{
		printf("pid=%d,ppid=%d \n",getpid(),getppid());
       	}
	return 0;
}
