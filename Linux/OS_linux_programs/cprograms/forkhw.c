#include<stdio.h>
#include<unistd.h>
void main()
{
	int return_value;
	return_value=fork();
	if(return_value>0)
	{
	int n1=0,n2=1,n3,i,number;
	printf("Parent Process:pid=%d,ppid=%d",getpid(),getppid());
	printf("\n%d\n%d",n1,n2);
	for(i=2;i<10;i++)
	{
		n3=n1+n2;;
		printf("\n%d",n3);
		n1=n2;
		n2=n3;
	}
	printf("\n");
	}
	if(return_value==0)
	{
		int i,j,k;
		printf("Child Process:pid=%d,ppid=%d\n",getpid(),getppid());
		for(i=2;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				k=i*j;
				printf("%dX%d=%d  ",i,j,k);
			
			}
			printf("\n");
		}
	}
}

