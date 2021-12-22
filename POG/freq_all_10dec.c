#include<stdio.h>
void countfrequencychar();
int main()
{

 char str[50]="ee3hjftyf  tgj333";
  countfrequencychar(str);
}

void countfrequencychar(char *s)
{
 int i,j,count,ch;

 for(i=0;s[i]!='\0';i++)
 {
     if(s[i]!='*')  // due to this condition  whwere we replaced value with * not get counted
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