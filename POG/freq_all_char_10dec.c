#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void frequencyofchar();
void main()
{
    
    char s[100];
   	printf("Enter String:\n");
	scanf("%s",&s);
	frequencyofchar(s);
}
void frequencyofchar(char *s)
{
    int i,j,count,ch;

 for(i=0;s[i]!='\0';i++)
 {
     if(s[i]!='*')  // due to this condition  where we replaced value with * not get counted
     {
         ch=s[i];
         count=1;
         for(j=i+1;s[j]!='\0';j++)
         {
             if(s[j]==ch)
             {
                 count++;
                 s[j]='*';
                 
             }
         }

         if(ch==32)
         printf("  Space - %d  ",count);
         else
         printf("  %c - %d  ",ch,count);
     }
 
 }  
}