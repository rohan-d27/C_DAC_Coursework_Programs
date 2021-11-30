#include<stdio.h>
#include<unistd.h>
#include<pthread.h>
int balance=10000;
void deposit()
{
	int x=0;
	while(x++<10)
	{
		balance=balance+100;
		printf("\n after adding 100 ruppes the balance is %d ",balance);
		sleep(1);
	}
}
void withdraw()
{
	int x=0;
	while(x++<10)
	{
		balance=balance-200;
		printf("\n after withdrawing 200 balance is %d",balance);
		sleep(1);
	}
}
void main()
{
	pthread_t th1,th2;
	pthread_create(&th1,NULL,(void *)deposit,NULL);
	pthread_create(&th2,NULL,(void *)withdraw,NULL);
	pthread_join(th1,NULL);
}
