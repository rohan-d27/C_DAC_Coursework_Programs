#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void printmostfrequentchar();
void main()
{
    
    char str[100];
   	printf("Enter String:\n");
	scanf("%s",&str);
	printmostfrequentchar(str);
}
void printmostfrequentchar(char *str)
{
    int arr[123],i,j,max;
    	char ch;
		char s[100];
		strcpy(s,str);
    for(i=0;i<123;i++)
    {
    arr[i] = 0; 
    for(i=0;i<s[i]!='\0';i++)
    {
        ch=s[i];
        if((ch >= '0') && (ch <= '9')|| (ch>='A') && (ch<='Z') || (ch>='a') || (ch<='z'))
        arr[ch]=arr[ch]+1;
        for(j=i+1;s[j]!='\0';j++)
        {
            if(ch==str[j])
            {
                arr[ch]=arr[ch]+1;
                str[j]='*';
            }
        } 
    }
    }
    max=arr[0];
    for(i=1;i<=122;i++)
    {
        if(arr[i]>max) max=arr[i];

    }
    for(i=0;s[i]!='\0';i++)
    {
        if(arr[s[i]]==max)
    printf("%c",s[i]);
        
    }

    
}