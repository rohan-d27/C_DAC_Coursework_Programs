#include<stdio.h>
#include<unistd.h>
#include<signal.h>

void sig_handler(int signo)
{
	printf("received %d\n",signo);
}
void main()
{
	signal(SIGINT,sig_handler);
	signal(SIGKILL,sig_handler);
	signal(SIGTERM,sig_handler);
	printf("Waiting in loop");
	
}

