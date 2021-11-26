#include<stdio.h>
int main() 
{
    char ch;
        printf("\n Enter the character ");
        scanf("%c", &ch);

    if(ch>='A' && ch<='Z')
    {    
       printf("\n Character is in  upper case");
       ch=ch+32;
       printf("\n lower case character is=%c", ch);
    }

    else if(ch>='a' && ch<='z')
    {
         printf("\n Character is in lower case"); 
           ch=ch-32;
         printf("\n upper case character is=%c", ch);
    }
    return 0;

}
