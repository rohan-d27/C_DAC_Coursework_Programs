#include<stdio.h>
int main() 
{
    char ch;
    printf("\n Enter the character ");
    scanf("%c", &ch);
    if(ch>='A' && ch<='Z')
    printf("\n Character is in  upper case");
    else if(ch>='a' && ch<='z')
    printf("\n Character is in lower case");
    return 0;

}