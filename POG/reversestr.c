#include<stdio.h>

void main()
{
	char  s[]="Rohan";
	printf(revstr(s));
}



char *revstr(char s[])
{
	int l,i;
	char t;
	for(l=0;s[l]!='\0';l++)
	{
      l=l-1;
	for(i=0;i<l;i++,l--)
	{
		t=s[i];
		s[i]=s[l];
		s[l]=t;
	}
}
	return s;
}
