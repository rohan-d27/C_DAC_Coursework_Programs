#include<stdio.h>
int main()
{
    int num,check;
    printf("Enter a number");
    scanf("%d", &num);
    check=num%5;
    if(check==0) 
    {
printf("Number is divisible by 5");
    }
    else {
        printf("number is not divisible by 5");
    }
    return 0;

}