#include<stdio.h>
int main()
{
int age;
printf("Enter your age");
scanf("%d",&age);
if(age<18)
{
printf("child");
}
else if(age>18&&age<=65)
{
printf("adult");
}
else if(age>65)
{
printf("senior citizen");
}
return 0;
}