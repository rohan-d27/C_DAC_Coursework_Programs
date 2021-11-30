#include"stdio.h"
#include"unistd.h"
#include"sys/wait.h"
void main()
{
	int rv,i;
	rv = fork();
	if(rv > 0)
	{
		wait(NULL);
		printf("Parent\n");
	}
	else
	{
		for(i=0;i<5;i++){
			printf("child\n");
		sleep(2);
	}
}
}
