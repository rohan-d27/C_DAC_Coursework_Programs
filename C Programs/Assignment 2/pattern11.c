/*12345
  2345
  345
  45
  5*/

#include<stdio.h>
int main()
{
int i,j,a=0;
for(i=1;i<=5;i++)
{++a;
for(j=5;j>=i;j--)
{
  printf("%d",a);
 a++;

}

printf("\n");
}
return 0;
}