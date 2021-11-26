#include<stdio.h>
int main()
{
    char ch;
    printf("Enter a character");
    scanf("%c", &ch);
    if( ch>='0' && ch<='9' )
    {
        printf("you have entered a number");
    }
    else
    {
        printf("you have not entered a number");
    }
    return 0;
}