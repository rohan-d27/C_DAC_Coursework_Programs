#include<stdio.h>
int main()
{
int i,j,a=1;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
  printf("%d",a);
 a++;
}
printf("\n");
}
return 0;
}