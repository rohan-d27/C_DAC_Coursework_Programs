#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
void main()
{
	int id=fork();
	printf("id=%d,ppid=%d\n",getpid(),getppid());
	if(id==0)
	{
		char *arr[]={"ps","-ef",NULL};
	//	execv("/bin/ps",arr);
		int id1=fork();
		printf("id=%d,ppid=%d\n",getpid(),getppid());
		if(id1==0)
		{
		//	char *arr[]={"ls","-l",NULL};
			execl("/bin/ls","-l",NULL);
		}
	}
	if(id>0)
	{
		wait(NULL);
		printf("GOOD BYE\n");
	}
}
