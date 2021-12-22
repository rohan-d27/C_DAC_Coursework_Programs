#include<stdio.h>
void main()
{
    char str[100];
   	printf("Enter String:\n");
	scanf("%s",&str);
	int i,cnt=0;
	for(i=0;str[i]!='\0';i++)
	{
	  if((str[i]>='0')&&(str[i]<='9'))
	  {
	  	if(((str[i+1]>='A') && (str[i+1]<='Z')) || ((str[i+1]>='a') && (str[i+1]<='z')))
	  	{
	  		printf(" %c ",str[i+1]); 
			cnt++;
		  }
		}	
	}
	
	printf("\n %d",cnt);
}
