#include<stdio.h>
#include<unistd.h>
#include<signal.h>
void main()
{
	int pid,signo;
	while(1)
	{
		printf("enter pid and signal num");
		scanf("%d%d",&pid,&signo);
		kill(pid,signo);
	}
}

