#include<stdio.h>
#include<unistd.h>
void main()
{
	char *arglist[]={"ls","-l",NULL};
	int pid;
	pid=fork();
	if(pid>0)
	{
		while(1 ){
			printf("parent is still running\n");
		sleep(2);
	}
}
else{
execv("/bin/ls",arglist);
}
}
