/*Write a program to print table of  1 to 10*/


#include<stdio.h>

int main()
{
    int i,j=1,mul;
    i=2;
    while(i<=10)
    {
        j=1;
        while(j<=10)
        {
            mul=i*j;
            printf("\t%d*%d=%d\n",i,j,mul);
            j++;
        }
        printf("\t");
        i++;
    }

}
