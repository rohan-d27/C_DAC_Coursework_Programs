#include<stdio.h>

int main()
{
    int a,b;
    int op;
    printf(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
    printf("Enter the values of a & b: ");
    scanf("%d %d",&a,&b);
    printf("Enter your Choice : ");
    scanf("%d",&op);
    switch(op)
    {
    case 1	:
        printf("addition of %d and %d is : %d",a,b,a+b);
        break;
    case 2	:
        printf("subsraction of %d and %d is : %d",a,b,a-b);
        break;
    case 3	:
        printf("multiplication of %d and %d is : %d",a,b,a*b);
        break;
    case 4	:
        printf("dSivision of Two Numbers is %d : ",a/b);
        break;
    default	:
        printf(" Enter Your Correct Choice.");
        break;
    }
    return 0;
}