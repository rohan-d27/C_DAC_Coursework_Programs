#include<stdio.h>
int main()
{
int sub1,sub2,sub3,avg;
printf("Enter marks in sub1 is ");
scanf("%d",&sub1);
printf("Enter marks in sub2 is ");
scanf("%d",&sub2);
printf("Enter marks in sub3 is ");
scanf("%d",&sub3);
avg=(sub1+sub2+sub3)/3;
printf("the average is:%d",avg);
return 0;
}