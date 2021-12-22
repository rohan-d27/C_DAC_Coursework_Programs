#include<stdio.h>
long convertTOdeci(int bin);

int main(void)
{
	int x = 1111;
	long res = convertTOdeci(x);
	printf("%ld ",res);
}

long convertTOdeci(int bin)
{
	long dec = 0,rem,base=1;
	while(bin>0)
	{
		rem=bin%10;
		dec = dec + rem*base;
		base = base*2;
		bin=bin/10;
	}
	return dec;
}


//binary to decimal
