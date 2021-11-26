/*Write a program to print table of 1 to 10*/


#include<stdio.h>

int main()
{
	 int i,j,k;
	 
	
	 for(i=2;i<=10;i++)
	 {
		  for(j=1;j<=10;j++)
		  {
			   k= i*j;
			   printf("%d*%d = %d\n",i,j,k);
		  }
		  printf("\t");
	 }
	 return 0;
}
