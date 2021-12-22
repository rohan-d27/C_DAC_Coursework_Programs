#include<stdio.h>
void main()
{
	char str1[50],str2[50];
	printf("Enter String:\n");
	scanf("%s",&str1);
	printf("Enter String:\n");
	scanf("%s",&str2);
	int k=anagram(str1,str2);
	if(k==1)
	{
		printf("Two Strings are Anagram");
	}
	else
	{
		printf("Two Strings are Not Anagram");
	}
}
int anagram(char str1[],char str2[])
{
	int flag=0,i,j;
	char ch;
	if(strlen(str1)!=strlen(str2))
	return 0;
	flag=0;
	for(i=0;str1[i]!='\0';i++)
	{
		for(j=0;str2[j]!='\0';j++)
		{
			if(str1[i]==str2[j])
			{	flag=1;
				ch=str2[i];
				str2[i]=str2[j];
				str2[j]=ch;
				
				if(strcmp(str1,str2)==0)	return 1;
			}
		}
		if(flag==0)
		return 0;
    }  
}
