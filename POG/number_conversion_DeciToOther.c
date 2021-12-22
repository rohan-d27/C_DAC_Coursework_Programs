#include<stdio.h>
void convert(int num , int base);

int main(void)
{
	int x = 30;
	convert(x,2);
	
}
void convert(int num , int base)
{
	int rem = num%base;
	if(num==0) return ;
	
	convert(num/base,base);
	
	if(rem<10)
		printf("%d",rem);
	else 
		printf("%c",rem-10+'A');
		
}
