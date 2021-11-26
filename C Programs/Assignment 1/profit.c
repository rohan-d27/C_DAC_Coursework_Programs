#include<stdio.h>
int main()
{
    int cp,sp,pr;
    printf("Enter cost price and selling price respectively");
    scanf("%d%d",&cp,&sp);
    pr=sp-cp;
     if (sp>cp)
    {
      printf("you have gained profit of %d rupees",pr);

    }
    else
    {
        printf("you have incurred loss of %d rupees",pr);
    }
    return 0;
}