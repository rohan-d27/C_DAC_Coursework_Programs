#include<stdio.h>
#include<unistd.h>
#include<pthread.h>

void editor()  //with threading
{
	int x=0;
	while(x++<10)
	{
		printf("editor code \n");
		sleep(1);
	}
}
void spellchecker()
{
	int x=0;
	while(x++<10)
	{
		printf("spellchecker code \n");
		sleep(1);
	}
}
void grammerchecker()
{
	int x=0;
	while(x++<10)
	{
		printf("grammer checker code\n");
		sleep(1);
	}

}
void main()
{
	pthread_t editthread ,spchkthread,grmrthread;
	//attach the path of execution to both the threads
	pthread_create(&editthread,NULL,(void *)editor,NULL);
	pthread_create(&spchkthread,NULL,(void *)spellchecker,NULL);
	pthread_create(&grmrthread,NULL,(void *)grammerchecker,NULL);
	pthread_join(editthread,NULL);//act like wait, main will stop till editor and spellchecker executes completely

	int x=0;
	while(x++<10)
	{
	printf("main thread\n");
	sleep(1);
	}
}

