#include<stdio.h>
int main()
{
    int num1,num2,num3;
    printf("Enter num1,num2,num3 respectively: ");
    scanf("%d%d%d",&num1,&num2,&num3);
    if(num1>num2) 
    {
        if(num1>num3)
        {
           printf("Num1 is greatest number");
        
        }
        }
         else if(num2>num1)
        {
            if(num2>num3)
            {
                printf("Num2 is greatest number");
            }
        }
        else
        {
        printf("Num3 is greatest number");
}
return 0;
}