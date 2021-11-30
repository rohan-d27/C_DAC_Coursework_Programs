#include<stdio.h>
#include<unistd.h>
#include<pthread.h>

void editor()  //with threading
{
	while(1)
	{
		printf("editor code \n");
		sleep(1);
	}
}
void spellchecker()
{
	while(1)
	{
		printf("spellchecker code \n");
		sleep(1);
	}
}
void main()
{
	pthread_t editthread ,spchkthread;
	//attach the path of execution to both the threads
	pthread_create(&editthread,NULL,(void *)editor,NULL);
	pthread_create(&spchkthread,NULL,(void *)spellchecker,NULL);
	
	while(1)
	{
	printf("main thread\n");
	sleep(1);
	}
}

