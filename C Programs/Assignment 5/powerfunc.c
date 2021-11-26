/*Q3.Write a function to calculate power and display the result in main (Do not use return statement)
void Power(int base, int p, int *result){ 
}*/


#include<stdio.h>
int main()
{
	int base,p,result=1;
	printf("Enter base ");
	scanf("%d",&base);
	printf("Enter power ");
	scanf("%d",&p);
	power(base,p,&result);
	printf("result is %d",result);
}
void power(int base,int p,int *result)
{
	int i;
	for(i=0;i<p;i++)
	{
	
	*result=base*(*result);
    }
}

