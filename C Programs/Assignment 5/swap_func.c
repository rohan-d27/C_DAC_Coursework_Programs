/*Q4.Write a function to swap two numbers using call by address. (Form the function on your own give relevant name )*/


#include<stdio.h>
int main()
{
	int x,y;
	printf("Enter two numbers ");
	scanf("%d%d",&x,&y);
	swap(&x,&y);
	printf("After swapping a=%d and b=%d",x,y);
	return 0;
}

void swap(int *x,int *y)
{
	int temp;
	temp=*x;
	*x=*y;
	*y=temp;
}
